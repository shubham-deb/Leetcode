import java.util.*;
public class binary_tree_levelorder {
	
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> lst = new ArrayList<List<Integer>>();
    	if(root==null) return lst;
    	Queue<TreeNode> nodes = new LinkedList<TreeNode>();
    	nodes.add(root);
    	List<Integer> addRoot = new ArrayList<Integer>();
    	addRoot.add(root.val);
    	lst.add(0,addRoot);
    	
    	while(nodes.size()>0){
    		List<Integer> children = new ArrayList<Integer>();
    		int size = nodes.size();
    		for(int i=0;i<size;i++){
    			TreeNode node = nodes.poll();
    			if(node.left!=null){
    				children.add(node.left.val);
    				nodes.add(node.left);
    			}
    			if(node.right!=null){
    				children.add(node.right.val);
    				nodes.add(node.right);
    			}
    		}
    		if(children.size()>0)
    			lst.add(0,children);
    	}
    	
    	return lst;
    }
	
	public static void main(String[] args) {
		TreeNode tr = new TreeNode(1);
		tr.left = new TreeNode(2);
		tr.right = new TreeNode(3);
		tr.left.left = new TreeNode(4);
		tr.left.right = new TreeNode(5);
		System.out.println(levelOrderBottom(tr));
	}

}
