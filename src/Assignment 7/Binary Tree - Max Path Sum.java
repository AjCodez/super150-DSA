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
	static int res;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Node> s= new Stack<>();
        int t= sc.nextInt();
        Node root = new Node(t);
        s.push(root);
        while(!s.isEmpty()){
            String n = sc.next();
            while(!n.equals("NULL")){
                s.peek().left = new Node(Integer.parseInt(n));
                s.push(s.peek().left);
                n=sc.next();
            }
            n = sc.next();
            Node temp;
            while(!s.isEmpty() && n.equals("NULL")){
                s.pop();
                if(!s.isEmpty())
                n=sc.next();
            }
            if(!s.isEmpty()){
                temp=s.pop();
                temp.right= new Node(Integer.parseInt(n));
                s.push(temp.right);
            }
        }
        res=Integer.MIN_VALUE;
        maxPathSum(root);
        System.out.print(res);
	}

	
    public static int maxPathSum(Node root) {
        if(root==null) return 0;
        int left = Math.max(0, maxPathSum(root.left));
        int right = Math.max(0, maxPathSum(root.right));
        res = Math.max(res, left+right+root.data);

        return Math.max(right,left)+root.data;
    }
}
