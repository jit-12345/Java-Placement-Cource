import java.util.*;
import java.util.LinkedList;
public class Tree_Subtree_check {
   public static class Node{
        int data;
        Node left;
        Node right;
        public Node( int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isIdentical(Node root,Node subroot){
        
        if (root==null && subroot==null) {
            return true;
        }
        if(root==null|| subroot==null|| root.data!=subroot.data){
            return false;
        }
        if (!isIdentical(root.left, subroot.left)) {
            return false;
        }
        if (!isIdentical(root.right, subroot.right)) {
            return false;
        }

        return true;
    }
    public static boolean isSubtree(Node root,Node subroot){
        if (root==null) {
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot))
            {
            return true;
            }
        }

        return isSubtree(root.left, subroot)||isSubtree(root.right, subroot);

    }
    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){
        //just like level order traversal
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        q.add(new Info(root, 0));
        q.add(null);
        int max=0;
        int min=0;
        while (!q.isEmpty()) {
            Info curr=q.remove();
            if (curr==null) {
                if (q.isEmpty()) {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if (!map.containsKey(curr.hd)) {
                   map.put(curr.hd,curr.node); 
                }
                if (curr.node.left!=null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(curr.hd-1, min);
                }
                if (curr.node.right!=null) {
                   q.add(new Info(curr.node.right, curr.hd+1));
                   max =Math.max(max, curr.hd+1); 
                }
            }
        }
        for (int i = min; i <=max; i++) {
            System.out.print(map.get(i).data+" ");
        }
    }
    public static void K_level(Node root,int k,int count){
        if (root==null) {
            return;
        }
        if (count==k) {
           System.out.print(root.data+" "); 
           return;
        }
        K_level(root.left, k, count+1);
        K_level(root.right, k, count+1);
    }
    public static boolean getpath(Node node,int n,ArrayList<Node> path){
        if (node==null) {
            return false;
        }
        path.add(node);
        if (node.data==n) {
            return true;
        }
        boolean foundLeft=getpath(node.left, n, path);
        boolean foundRight=getpath(node.right, n, path);
         if (foundLeft||foundRight) {
            return true;
         }
         path.remove(path.size()-1);
         return false;
    }
    public static Node lca(Node root,int n1,int n2){
       ArrayList<Node> path1=new ArrayList<>();
       ArrayList<Node> path2=new ArrayList<>();

       getpath(root,n1,path1);
       getpath(root,n2,path2);
       int i = 0;
        for (; i <path1.size() && i< path2.size() ; i++) {
            if (path1.get(i)!=path2.get(i)) {
                break;
            }
        }
        Node ans=path1.get(i-1);
        return ans;
    }
    public static Node lca2(Node root,int n1,int n2){
        if (root == null || root.data== n1 || root.data== n2) {
            return root;
        }
        Node foundLeft=lca2(root.left, n1, n2);
        Node foundRight=lca2(root.right,n1,n2);
        if (foundLeft==null) {
            return foundRight;
        }
        if (foundRight==null) {
            return foundLeft;
        }
        return root;
    }
    public static int lcadist(Node root,int n){
        if (root==null) {
            return -1;
        }
        if (root.data==n) {
            return 0;
        }
        int leftdist=lcadist(root.left, n);
        int rightdist=lcadist(root.right,n);
        if (leftdist==-1 && rightdist==-1) {
            return -1;
        }
        else if (leftdist==-1) {
            return rightdist+1;
        }
        else {
            return leftdist+1;
        }
        // return -1;
    }
    public static int minDistance(Node root,int n1,int n2){
        Node node=lca2(root, n1, n2);
        int dist1=lcadist(node,n1);
        int dist2=lcadist(node,n2);
        return dist1 + dist2 ;
    }
    public static int KAncestot(Node root,int n,int k){
        if (root==null) {
            return -1;
        }
        if (root.data==n) {
            return 0;
        }
        int leftdist=KAncestot(root.left, n, k);
        int rightdist=KAncestot(root.right, n, k);
        if (leftdist==-1 && rightdist==-1) {
            return -1;
        }
        int max=Math.max(leftdist, rightdist);
        if (max+1== k) {
            System.out.println(root.data);
        }
        return max+1;

    }
    public static int transform_subtree_sum(Node root){
        if (root==null) {
            return 0;
        }
        
        int leftChild=transform_subtree_sum(root.left);
        int rightChild=transform_subtree_sum(root.right);
        int data=root.data;
        int newLeft=root.left==null ?0:root.left.data;
        int newRight=root.left==null ?0:root.right.data;
        root.data=leftChild+newLeft+ rightChild+newRight;
        return data;
    }
    
    public static void main(String args[]){
        /*
        tree
         1
        / \
       2   3
      / \ /  \
     4  5 6   7
         */
        Node root =new Node(1);
        //left part
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        //right part
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        /*
        subtree
         2
        / \
       4   5

         */
        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        

        //System.out.println(isSubtree(root, subroot));
        //topView(root);
        //K_level(root, 3, 1);
        //System.out.println(lca(root,1,1).data);
       // System.out.println(lca2(root,6,5).data);
        //System.out.println(minDistance(root,6,5));
        //System.out.println(KAncestot(root,4,2));
        transform_subtree_sum(root);
        System.out.println(root.data);

    }
}
