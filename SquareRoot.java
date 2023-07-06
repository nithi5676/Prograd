import java.util.Scanner;

public class SquareRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int result = 0;
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i + "th" + " iteration");
            if (i * i <= n) {
                // System.out.println(i);
                result = i;
                // i = i + 1;
            }
        }
        System.out.println(result);
    }

}
