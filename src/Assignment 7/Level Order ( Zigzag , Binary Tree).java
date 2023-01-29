import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
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

		public void levelOrderZZ() {
			Deque<Node> dq = new LinkedList<>();
			dq.addLast(root);
			boolean lvl = true;
			while(!dq.isEmpty()){
				int n = dq.size();
				for(int i=0;i<n;i++){
					if(lvl){
						Node temp = dq.removeFirst();
						if(temp.left!=null) dq.addLast(temp.left);
						if(temp.right!=null) dq.addLast(temp.right);
						System.out.print(temp.data+" ");
					}
					else{
						Node temp = dq.removeLast();
						if(temp.right!=null) dq.addFirst(temp.right);
						if(temp.left!=null) dq.addFirst(temp.left);
						System.out.print(temp.data+" ");
					}
				}
				lvl=!lvl;
			}
		}

	}

}
