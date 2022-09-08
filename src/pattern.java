public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i; ++j) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n + i; ++j) {
                if (j < i * 2)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j < n - i - 1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

        }
        
    }
}