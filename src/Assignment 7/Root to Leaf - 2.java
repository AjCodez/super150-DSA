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
		int n = sc.nextInt();
		int c = pathSum(root,n);
        System.out.print(c);
	}

	
    public static int pathSum(Node root, int target) {
        if(root==null) return 0;
        target-=root.data;
        if(root.left==null && root.right==null && target==0) return 1;
    
        int l = pathSum(root.left, target);
        int r = pathSum(root.right, target);
        
        return l+r;
    }
}
