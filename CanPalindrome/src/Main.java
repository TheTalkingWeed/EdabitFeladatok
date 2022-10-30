import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindromePossible("rearcac"));
        System.out.println(isPalindromePossible("suhbeusheff"));
        System.out.println(isPalindromePossible("palindrome"));


    }

    public static boolean isPalindromePossible(String input){
        Map<Character,Integer> letters = new HashMap<>();
        int count;
        int oddCount = 0;
        for (int i = 0; i < input.length(); i++)
            letters.put(input.charAt(i),0);

        for (int i = 0; i < input.length(); i++) {
            count = letters.containsKey(input.charAt(i)) ? letters.get(input.charAt(i)) : 0;
            letters.put(input.charAt(i), count+1);

        }

        for (Character i : letters.keySet()) {
            if (letters.get(i) % 2 == 1){
                oddCount ++;
            }
        }

        return oddCount == 1 || oddCount == 0;
    }
}