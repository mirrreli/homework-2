import java.util.Scanner;

public class main {
    public static int[] makeMass(String str) {
        String[] strArr = str.split("");
        int arr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++){
            arr[i] = Integer.parseInt((strArr[i]));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int curr = 0, last = 0;
        boolean prevEl = false;
        System.out.println("Enter String: ");
        String str = in.nextLine();
        int[] arr = makeMass(str);
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == 0)
                curr++;
            else{
                if(curr >= last)
                    last = curr;
                curr = 0;
            }
        }
        if(last > curr)
            System.out.println(last);
        else
            System.out.println(curr);
    }
}
