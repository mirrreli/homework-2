
import java.util.Scanner;

public class main {

    public static String make(String user, int N)
    {
        String str = "";
        for (int i = 0; i < N; i++)  str+= user;
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String: ");
        String user = in.nextLine();
        System.out.print("Enter pow: ");
        int N = in.nextInt();
        if(N > 0)
        {
            String str = make(user, N);
            if(str.length() > 1023)
            {
                for (int i = 0; i < 1023; i++) System.out.print(str.charAt(i));
            }
            else System.out.println(make(user,N));
        }
        else
        {
         N = Math.abs(N);
         String str = "";
            for (int i = 0; i < user.length() / N; i++)
            {
                str += user.charAt(i);
                if (make(str, N) == user) {
                    System.out.println(str);
                    break;
                }
            }
            System.out.println("No colution");
        }
    }
}
