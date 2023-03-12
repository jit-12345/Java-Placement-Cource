import java.util.*;
import java.util.LinkedList;
public class Tree_build_preeorder{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if (nodes[idx]== -1) {
               return null; 
            }
           Node newnode= new Node(nodes[idx]);
           newnode.left=buildtree(nodes);
           newnode.right=buildtree(nodes);

           return newnode;

        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            
            
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            
            
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");

        }
        //level order traversal
        public static void levelorder(Node root)
        {
            if (root==null) {
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode=q.remove();
                if (currNode==null) 
                {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else
                {
                    System.out.print(currNode.data+" ");
                    if (currNode.left!=null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right!=null) {
                        q.add(currNode.right);
                    }
                }
                
            }
        }
        //height
        public static int height(Node root)
        {
            if(root==null){
                return 0;
            }
           int lh=height(root.left);
           int rh=height(root.right);
            return Math.max(lh, rh)+1;
        }
        //nodecount
        public static int nodeCount(Node root){
            if (root==null) {
                return 0;
            }
            int leftNode=nodeCount(root.left);
            int rightNode=nodeCount(root.right);
            return leftNode+rightNode+1;
        }
        //sum
        public static int sumOfNode(Node root){
            if (root==null) {
                return 0;
            }
            int leftSum=sumOfNode(root.left);
            int rightSum=sumOfNode(root.right);
            return leftSum+rightSum+root.data;
        }
        //diameter
        public static int diameter(Node root){
            if (root==null) {
                return 0;
            }
            //height count
            int lh=height(root.left);
            int rh=height(root.right);
            //diameter count
            int ld=diameter(root.left);
            int rd=diameter(root.right);
            //self diameter
            //when root include
            int selfdmtr=lh+rh+1;
            return Math.max(selfdmtr,Math.max(rd, ld));

        }
        static class Info{
            int diam;
            int ht;
           public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
           }
        }
        public static Info CalDiam(Node root){
            if (root==null) {
                return new Info(0, 0);
            }

            Info leftInfo=CalDiam(root.left);
            Info rightInfo=CalDiam(root.right);

            int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
            int height=Math.max(leftInfo.ht, rightInfo.ht)+1;

            return new Info(diam,height);
        }
    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(nodes);
        //System.out.println(root.data);
        // System.out.println(buildtree(nodes).data);
       // tree.preorder(root);
       
       //tree.inorder(root);
       //tree.postorder(root);
       //tree.levelorder(root);
       //System.out.print(tree.height(root));
      // System.out.print(tree.nodeCount(root));
      // System.out.print(tree.sumOfNode(root));
      // System.out.print(tree.diameter(root));
       System.out.print((tree.CalDiam(root)).diam);
       
    }
}