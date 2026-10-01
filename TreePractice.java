public class TreePractice {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        System.out.println(tree.root.left.left.right.data);
        System.out.println(tree.root.right.right.data);
        tree.preorder();
    }
}

class BinaryTree {
    TreeNode root;
    public void insert(int i){
        if (root == null)
            root = new TreeNode(i);
        else{
            TreeNode current = root;
            boolean cont = true;
            while (cont){
                if (i <= current.data){
                    //Go to left
                    if (current.left == null){
                        current.left = new TreeNode(i);
                        cont = false;
                    }
                    else{
                        current = current.left;
                    }
                }
                else{
                    if (current.right == null){
                        current.right = new TreeNode(i);
                        cont = false;
                    }
                    else{
                        current = current.right;
                    }
                }
            }
        }
    }
    public void inorder(){
        inOrderTraverse(root);
    }

    public void inOrderTraverse(TreeNode root){
        if (root != null){
            inOrderTraverse(root.left);
            System.out.print(root.data+" ");
            inOrderTraverse(root.right);
        }
    }

    public void preorder(){
        preOrderTraverse(root);
    }

    public void preOrderTraverse(TreeNode root){
        if (root != null){
            System.out.print(root.data+" ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}
