import java.util.*;
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){
		this.data = data;
	}
}
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Queue<TreeNode> q = new LinkedList<>();
		TreeNode root = new TreeNode(sc.nextInt());
		q.add(root);
		while(!q.isEmpty()){
			TreeNode temp = q.remove();
			int n = sc.nextInt();
			if(n!=-1){
				temp.left = new TreeNode(n);
				q.add(temp.left);
			}
			int m = sc.nextInt();
			if(m!=-1){
				temp.right = new TreeNode(m);
				q.add(temp.right);
			}
		}
		leaf(root);
    }
	private static void leaf(TreeNode node){
		if(node==null) return;
		if(node.left==null && node.right==null) {
			System.out.print(node.data+" ");
			return;
		}
		leaf(node.left);
		leaf(node.right);
	}
}
