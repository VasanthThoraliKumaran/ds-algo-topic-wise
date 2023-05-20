package tree;
public class TreeNode {
    int data;
    int horizontalDistance = 0;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        left = right = null;
    }
}
