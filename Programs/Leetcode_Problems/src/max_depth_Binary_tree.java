
public class max_depth_Binary_tree {
    
	public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        else return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(6);
		System.out.println(maxDepth(root));
	}

}
