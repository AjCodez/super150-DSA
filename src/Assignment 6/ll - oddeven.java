import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}
public class Main {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node l1=new Node(0);
		Node t1=l1;
		Node l2=new Node(0);
		Node t2=l2;

		for(int i=0;i<n;i++){
			int t = sc.nextInt();
			if(t%2==0) {
				t2.next=new Node(t);
				t2=t2.next;
			}
			else{
				t1.next=new Node(t);
				t1=t1.next;
			}
		}
		t1.next=l2.next;
		while(n-->0){
			System.out.print(l1.next.data+" ");
			l1=l1.next;
		}
    }
}
