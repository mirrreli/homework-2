import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        System.out.print("Input text: ");
        String[] Words = new Scanner(System.in).nextLine().split(" ");
        for(String word: Words) wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
        System.out.println(wordsMap);
    }
}