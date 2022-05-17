import java.util.Scanner;
public class Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("n is an even number");
        }
        if (n % 2 != 0) {
            System.out.println("n is an odd number");
        }
        if (n == 0) {
            System.out.println("n is equal to 0");
        }
        if (n < 0) {
            System.out.println("n is a negative number");
        }
        if (n > 0) {
            System.out.println("n is a positive number");
        }
        String a = sc.next();
        String b = sc.next();
        if (a.equals(b)) {
            System.out.println("two people have the same name");
        } else {
            System.out.println("two people don't have the same name");
        }
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        if (c >= d && c >= e) {
            System.out.println(c);
        } else if (d >= e) {
            System.out.println(d);
        } else {
            System.out.println(e);
        }
    }
}
