import java.util.*;
class Node{
	int data;
	Node next;
	Node prev;
	Node(int d){
		data=d;
	}
}
public class Main {
	static Node head;
    public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Node l1=new Node(-1);
		Node l2=new Node(-1);
		Node l3=new Node(-1);

		for(int i=0;i<n;i++){
			l1.next=new Node(sc.nextInt());
			l1.next.prev=l1;
			l1=l1.next;
		}
		for(int i=0;i<m;i++){
			l2.next=new Node(sc.nextInt());
			l2.next.prev=l2;
			l2=l2.next;
		}
		int c=0;
		int s=0;
		while(l1.data!=-1 || l2.data!=-1){
			s+=c;
			if(l1.data!=-1) {
				s+=l1.data;
				l1=l1.prev;
			}
			if(l2.data!=-1){
				s+=l2.data;
				l2=l2.prev;
			}
			Node temp=new Node(s%10);
			temp.next=l3;
			l3=temp;
			c=s/10;
			s=0;
		}
		if(c>0){
			Node temp=new Node(c);
			temp.next=l3;
			l3=temp;
		}
		while(l3.data!=-1){
			System.out.print(l3.data+" ");
			l3=l3.next;
		}
    }
}
