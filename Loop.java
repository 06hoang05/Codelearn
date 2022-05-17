import  java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //42
        int n = sc.nextInt();
        for (int i =1;i <= n; i++) {
            System.out.print(i + " ");
        }
        //43
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a;i <= b;i++){
            System.out.print(i+ " ");
        }
        //44
        int m = sc.nextInt();
        for (int i = m; i >= -m ; i--) {
            System.out.print(i + " ");
        }
        //45
        int c = sc.nextInt();
        int d = sc.nextInt();
        int answer = 0;
        for (int i = c; i <= d; i++) {
            answer += i;
        }
        System.out.println(answer);
//47
        int u = sc.nextInt();
        int y = sc.nextInt();
        for (int i = u; i <= y; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
       //48
        int z = sc.nextInt();
        int as = 1;
        for (int i = 1; i <= z; i++) {
            // answer *= i tương đương với answer = answer * i;
            as *= i;
        }
        System.out.print(as);
    }
}
