import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = in.nextLine();
        char[] a = str.toCharArray();
        int l = str.length();
        int x, t = 0;
        for (int i = 0; i < l; i++)
        {
            x = 0;
            while (a[i] > '0' && a[i] <='9')
            {
                x*=10;
                x += (int)(a[i++] - '0');
            }
            if(x==0) {
                System.out.print(a[i]);
                t++;
                if (t % 40 == 0) System.out.println(" ");
            }
            else {
                for(int j = 0; j < x; j++)
                {
                    System.out.print(a[i]);
                    t++;
                    if(t % 40 == 0)
                        System.out.println(" ");
                    }
                }
            }
        }
    }

