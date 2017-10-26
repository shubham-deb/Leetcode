
public class longest_univalue_path {
	static int ans;
	
	public static int getLength(TreeNode root){
		if(root == null) return 0;
		int left = getLength(root.left);
		int right = getLength(root.right);
		int lenR=0,lenL=0;
		
		if(root.left!=null && root.left.val == root.val){
			lenL+= left+1;
		}
		if(root.right!=null && root.right.val == root.val){
			lenR+= right+1;
		}
		ans = Math.max(ans, lenL+lenR);
		return Math.max(lenL, lenR);
	}
	
    public static int longestUnivaluePath(TreeNode root) {
    	ans = 0;
    	getLength(root);
    	return ans;
    }
	
	public static void main(String[] args) {
		TreeNode tr = new TreeNode(5);
		tr.left = new TreeNode(4);
		tr.right = new TreeNode(5);
		tr.left.right = new TreeNode(1);
		tr.left.left = new TreeNode(1);
		tr.right.right = new TreeNode(5);
		System.out.println(longestUnivaluePath(tr));
	}

}
