import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = in.nextLine();
        boolean flag = false;
        int length = word.length();
        int start = 0;
        int end = length - 1;
        while (end > start) {
            char startChar = word.charAt(start++);
            char endChar = word.charAt(end--);
            if (startChar == endChar)
                flag = true;
            else
                flag = false;
        }
        if(flag)
            System.out.println("palindrom");
        else
            System.out.println("Not palindrom");
    }
}
