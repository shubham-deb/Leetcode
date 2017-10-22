
public class balanced_binary_tree {

    public static int getHeight(TreeNode root){
        if(root == null) return 0;
        int left = 1 + getHeight(root.left);
        int right = 1 + getHeight(root.right);
        return Math.max(left,right);
    }
    
    public static boolean isBalanced(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;

        int left  = getHeight(root.left);
        
        int right = getHeight(root.right);
        
        return (Math.abs(left-right) <= 1) &&
                isBalanced(root.left)&&isBalanced(root.right);
    }
    
	public static void main(String[] args) {
		TreeNode tr = new TreeNode(1);
		tr.right = new TreeNode(2);
		tr.left = new TreeNode(3);
		System.out.println(isBalanced(tr));
	}

}
