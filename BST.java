import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node Build_BST(Node root,int val){
        if (root==null) {
            root=new Node(val);
            return root;
        }
        if (root.data>val) {
            //left subtree
            root.left=Build_BST(root.left, val);
        }
        else{
            //right subtree
            root.right=Build_BST(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean isFound(Node root,int key){
        if (root==null) {
            return false;
        }
        if(root.data==key){
            return true;
        }
        boolean found= key >root.data ?isFound(root.right, key):isFound(root.left, key);
        return found;

    }
    public static Node Delete(Node root,int val){
       
        if (root.data<val) {
            root.right=Delete(root.right, val);
        }
        if (root.data>val) {
            root.left= Delete(root.left, val);
         }
        
        
        else{//root.data==val
             //case 1-- If it is a child node or leaf Node
            if (root.left==null && root.right==null) {
                return null;
            }
            //case 2-- If it has only one child
            if (root.left==null) {
               return root.right;
            }
            else if (root.right==null) {
                
                return root.left;
            }
        //case 3--If it has two children
        //Inorder successor is a left most Node in RightSubtree
           Node IS= findInorderSuccessor(root.right);
           root.data=IS.data;
           root.right= Delete(root.right, IS.data);
           
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while (root.left!=null) {
            root=root.left;
        }
        return root;
    }
    public static void printInRange1(Node root,int min,int max,ArrayList<Integer>list){
       
       if (root==null) {
        return;
       }
       if (root.data>=min && root.data<=max) {
         list.add(root.data);
       }
       printInRange1(root.left, min, max, list);
       printInRange1(root.right, min, max, list);
    }
    public static void printInRange2(Node root,int k1,int k2){
        if (root==null) {
            return;
        }
        if (root.data>=k1 && root.data<=k2) {
            printInRange2(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange2(root.right, k1, k2);
        }
        else if(root.data<k1){
            printInRange2(root.left, k1, k2);
        }
        else if(root.data>k2){
            printInRange2(root.right, k1, k2);
        }
    }
    public static void print_path(ArrayList<Integer>path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
        
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if (root==null) {
            return;
        }
        path.add(root.data);
        if (root.left==null && root.right==null) {
            //print_path(path);
           System.out.println(path);
            
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static boolean isValid(Node root,Node min,Node max){
        if (root==null) {
            return true;
        }
        if (min!=null && root.data<=min.data) {
            return false;
        }
        if (max!=null && root.data>=max.data) {
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right,root,max);
    }
    public static Node Mirror(Node root){
        if(root==null){
            return null;
        }
        Node LeftSub=Mirror(root.left);
        Node RightSub=Mirror(root.right);
        //add in opposite
        root.left=RightSub;
        root.right=LeftSub;
        return root;
    }
   
    public static void main(String[] args) {
        // Node root=new Node(4);
        // root.left=new Node(2);
        // root.left.left=new Node(1);
        // root.left.right=new Node(3);
        // root.right=new Node(5);
        // root.right.right=new Node(6);
        
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for (int i = 0; i < values.length; i++) {
           root = Build_BST(root, values[i]);
        }
       // inorder(root);
       //System.out.println(isFound(root, 7));
    //    if (isFound(root, 7)) {
    //     System.out.println("Data Found");
    //    }
    //    else{
    //     System.out.println("Data not found");
    //    }
       // Delete(root, 10);
       // inorder(root);
    //    ArrayList<Integer> list= new ArrayList<>();
    //    int k1=5;
    //    int k2=12;
    //    printInRange(root, Math.min(k1, k2), Math.max(k1, k2),list);
    //    System.out.print(list);
    // printInRange2(root, 5, 12);
    //printRoot2Leaf(root, new ArrayList<>());
    // if (isValid(root, null, null)) {
    //     System.out.println("Valid BST");
    // }
    // else{
    //     System.out.println("Invalid BST");
    // }
   Node node= Mirror(root);
    inorder(node);  
    }
   
}
