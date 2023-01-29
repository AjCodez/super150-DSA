import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = bt.lowestCommonAncestor(bt.root,a,b);
		System.out.print(c);
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		public Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public int lowestCommonAncestor(Node root,int a,int b) {
			if(root==null) return -1; 
			if(a==root.data || b==root.data) return root.data;
			int left = lowestCommonAncestor(root.left, a, b);
			int right = lowestCommonAncestor(root.right, a, b);
			if(left!=-1 && right!=-1) return root.data;
			if(left!=-1) return left;
			if(right!=-1) return right;
			return -1;
		}

	}

}
