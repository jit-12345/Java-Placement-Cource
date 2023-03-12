import java.util.*;
public class Balance_BST {
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
    public static Node Build_Balance_BST(ArrayList <Integer> arr,int si,int ei){
        if (si>ei) {
            return null;
        }
        int mid=(si+ei)/2;
        Node root=new Node(arr.get(mid));
        root.left=Build_Balance_BST(arr, si, mid-1);
        root.right=Build_Balance_BST(arr, mid+1, ei);
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root,ArrayList<Integer>list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.data);
        // System.out.print(root.data+" ");
        inorder(root.right,list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        ArrayList <Integer>list=new ArrayList<>();
        inorder(root,list);
        //  Node root=Build_Balance_BST(arr,0,arr.size()-1);
        // preorder(root);
        //  System.out.println(list);
        Node node=Build_Balance_BST(list,0,list.size()-1);
        preorder(node);
    }
}
