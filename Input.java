import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Hello " + sc.next());
        String name = sc.next();
        String address = sc.next();
        int age = sc.nextInt();
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("In 15 years, age of " + name + " will be " + (age + 15));
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(" c % d = " + ( c % d));
        System.out.println(" c + d = " + (c + d));
        System.out.println(" c - d = "+ ( c - d));
        System.out.println(" c * d = "+ ( c * d));
        System.out.println(" c / d = "+ ( c / d));
        System.out.println(c > d);
        int g =c;
        c = d;
        d = g;
        System.out.println("after swapping, c = " + c + ", d = " + d);
        char a = (char)(sc.next().charAt(0) + 1);
        System.out.println(a);
    }
}
