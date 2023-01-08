import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}

public class Main{
	public static void print(Node temp){
        if(temp==null)
            return;
        else{
            print(temp.next);
            System.out.print(temp.data+" ");
        }
    }
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node l=new Node(0);
		Node t=l;
		for(int i=0;i<n;i++){
			l.next=new Node(sc.nextInt());
			l=l.next;
		}
		print(t.next);
	}
}
