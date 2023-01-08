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
		Scanner sc=new Scanner(System.in);
		int n=0;
		Node l = new Node(0);
		Node t=l;
		while (true){
			int d = sc.nextInt();
			if(d==-1) break;
			n++;
			l.next=new Node(d);
			l=l.next;
		}
		int k=sc.nextInt();
		for(int i=0;i<n-k;i++) t=t.next;
		System.out.print(t.next.data);
    }
}
