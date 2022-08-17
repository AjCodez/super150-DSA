public class fibonacci {
    public static void main(String[] args) {
        int n=3;
        int a1=0;
        int a2=1;
        int a=a1+a2;
        if (n==1)
            System.out.println(a1);
        else  if(n==2)
            System.out.println(a2);
        else{
        while (n!=2) {
            a1=a2;
            a2=a;
            a=a1+a2;
            n--;
        }
        System.out.println(a);}
    }
}
