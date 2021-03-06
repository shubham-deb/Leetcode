class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x){
		this.val  = x;
	}
}

public class min_depth {
	
	public int find_depth(TreeNode root){
        if(root==null) return 0;
		else if(root.left == null && root.right == null) return 1;
		int l = find_depth(root.left);
        int r = find_depth(root.right);
        int m = Math.min(l,r);
        return (1 + (m>0?m:Math.max(l,r)));
	}
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.right = new TreeNode(5);
		tree.left.left = new TreeNode(4);
		tree.left.left.left = new TreeNode(7);
		tree.right.left = new TreeNode(6);
		
		System.out.println(new min_depth().find_depth(tree));

	}
}
