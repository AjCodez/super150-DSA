import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		int t = scn.nextInt();
		ArrayList<Integer> ar = new ArrayList<>();
		bt.pathSum(bt.root,t,ar);
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

		public void pathSum(Node root, int target, ArrayList<Integer> arr) {
			if(root==null) return;
			target-=root.data;
			arr.add(root.data);
			if(root.left==null && root.right==null && target==0) {
				if(target==0) for(int i=0;i<arr.size();i++)
					System.out.print(arr.get(i)+" ");
			}
			else{
				pathSum(root.left, target, arr);
				pathSum(root.right, target, arr);
			}
			arr.remove(arr.size()-1);
		}

	}

}
