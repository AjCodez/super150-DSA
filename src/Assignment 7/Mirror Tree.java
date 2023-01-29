import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Node> q= new LinkedList<>();
        int t= sc.nextInt();
        Node root = new Node(t);
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.remove();
            t = sc.nextInt();
            if(t!=-1){
                temp.left = new Node(t);
                q.add(temp.left);
            }
            t=sc.nextInt();
            if(t!=-1){
                temp.right = new Node(t);
                q.add(temp.right);
            }
        }
		boolean f = mirrorTree(root,root);
        if(f) System.out.print("YES");
        else System.out.print("NO");
	}

	
    public static boolean mirrorTree(Node root1,Node root2) {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.data!=root2.data) return false;
        return mirrorTree(root1.left,root2.right) && mirrorTree(root1.right, root2.left);
    }
}
