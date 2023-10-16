import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        System.out.println(10 + 9 + "Hello World!");
        System.out.println(str + " " + ch);

        System.out.println(Integer.parseInt("97"));

        sc.close();
    }
}
