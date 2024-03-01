package Binary_trees;
import java.util.*;
public class BinaryTreesBuilder {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class BinaryTree{
        public static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
        public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left !=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static int countNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);
            return leftCount + rightCount + 1;
        } 
        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }
        public static int heightOfNode(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = heightOfNode(root.left);
            int rightHeight = heightOfNode(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
        static class TreeInfo{
            int ht;
            int diam;
            public TreeInfo(int ht, int diam){
                this.ht = ht;
                this.diam = diam;
            }
        }
        public static int diameterNode(Node root){
            if(root == null){
                return 0;
            }   
            int leftDiam = diameterNode(root.left);
            int rightDiam = diameterNode(root.right);
            int maxHeight = heightOfNode(root.left) + heightOfNode(root.right) + 1;
            return Math.max(maxHeight,Math.max(leftDiam, rightDiam));
        }

        public static TreeInfo diameter2Helper(Node root){
            if(root == null){
                return new TreeInfo(0,0);
            }
            TreeInfo left = diameter2Helper(root.left);
            TreeInfo right = diameter2Helper(root.right);
            int myHeight = Math.max(left.ht, right.ht) + 1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;
            int myDiam = Math.max(diam3, Math.max(diam1, diam2));
            TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
            return myInfo;
        }

        public static int diameter2(Node root){
            TreeInfo info = diameter2Helper(root);
            return info.diam;
        }

        public boolean isIdentical(Node root1, Node root2)
        {
            // Code Here
            if(root1 == null && root2 == null){
                return true;
            }
            if(root1 == null || root2 == null){
                return false;
            }
            if(root1.data == root2.data){
                return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
            }
            return false;
	    }
        //print the mirror of a tree
        void mirror(Node node) {
            // Your code here
            if(node == null){
                return;
            }
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
            
            mirror(node.left);
            mirror(node.right);
        }
    }

    // check if the tree is symmetric or not
    public static boolean isSymmetric(Node root)
    {
        if(root == null){
            return true;
        }
        return isMirror(root.left, root.right);
    }
    public static boolean isMirror(Node left, Node right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.data == right.data){
            return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
        return false;
    }


    // check if the tree is balanced or not
    static int heightTree(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    boolean isBalanced(Node root)
    {
	    if(root == null){
	        return true;
	    }
	    int leftHeight = heightTree(root.left);
	    int rightHeight = heightTree(root.right);
	    if(Math.abs(leftHeight - rightHeight) <=1){
	        return isBalanced(root.left) && isBalanced(root.right);
	    }
	    return false;
    }

    //Function to check whether all nodes of a tree have the value equal to the sum of their child nodes

    public static int isSumProperty(Node root)
    {
        if(root == null){
            return 1;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int leftSum = root.left != null ? root.left.data : 0;
        int rightSum = root.right!=null ? root.right.data : 0;
        
        if(root.data == (leftSum + rightSum) && isSumProperty(root.left) == 1 && isSumProperty(root.right) == 1){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        // tree.postOrder(root);
        // System.out.println();
        // tree.levelOrder(root);
        // int count = tree.countNodes(root);
        // System.out.println("The no of nodes in the tree: " + count);
        // int sum = tree.sumOfNodes(root);
        // System.out.println("SUm of nodes: " + sum);
        // int height = tree.heightOfNode(root);
        // System.out.println("Height of tree : "+ height);
        int diameter = tree.diameter2(root);
        System.out.println(diameter);
    }
}
