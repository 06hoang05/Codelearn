import java.util.Scanner;
public class Loop46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int an = 0;
        for (int i = 0; i <= g; i++) {
            if (i % 2 != 0) {
                an += i;
            }
        }
        System.out.println(an);
    }
}