import java.util.Scanner;

public class lucky {
    public static void check(int num, int kol) {
        int s1 = 0, s2 = 0, i;
        for (i = 0; i < kol/2; i++) {
            s1 += num % 10;
            num /= 10;
        }
        for (i = 0; i < kol/2; i++) {
            s2 += num % 10;
            num /= 10;
        }
        if (s1 == s2)
            System.out.println("Lucky");
        else
            System.out.println("Unlucky");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, ticket;
        System.out.print("Enter number: ");
        ticket = in.nextInt();
        int k = 0, vrem = ticket;
        while (vrem > 0) {
            vrem /= 10;
            k++;
        }
        if (k % 2 != 0)
            System.out.println("number should be even");
        else {
            check(ticket, k);
        }
    }
}

