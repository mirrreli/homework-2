import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args){
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = random.nextInt(10);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println("Enter 4 digits number");
        int[] userArr = new int[4];
        int cows, mulls;
        while (true) {
            cows = 0;
            mulls = 0;
            System.out.print("Please, enter your number: ");
            int user_num = in.nextInt();
            for (int i = 0; i < 4; i++) {
                userArr[3 - i] = user_num % 10;
                user_num /= 10;
            }
            boolean flag = false;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < i; j++) {
                    if (userArr[i] == userArr[j] && i != j) {
                        flag = true;
                    }
                }
            }
            if(flag) {
                System.out.println("Error: the number has no doubles.");
                continue;
            }
                for (int i = 0; i < 4; i++) {
                    if (userArr[i] == arr[i]) {
                        mulls++;
                    }
                    int j;
                    for (j = 0; j < 4 && userArr[i] != arr[j]; j++) ;
                    if (i != j && j < 4) {
                        cows++;
                    }
                }
                System.out.println("cows = " + cows + ", mulls = " + mulls);
                if (mulls == 4) {
                    break;
                }
            }
            System.out.println("You win!");
        }
    }
