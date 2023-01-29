import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
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

		public ArrayList<ArrayList<Integer>> levelArrayList() {

			ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
			if(root==null) return arr;
			Queue<Node> q = new LinkedList<>();
			q.offer(root);
			while(!q.isEmpty()){
				int s = q.size();
				ArrayList<Integer> ar = new ArrayList<>();
				for(int i=0;i<s;i++){
					Node temp = q.poll();
					if(temp.left!=null) q.offer(temp.left);
					if(temp.right!=null) q.offer(temp.right);
					ar.add(temp.data);
				}
				arr.add(ar);
			}
			return arr;
		}


	}

}
