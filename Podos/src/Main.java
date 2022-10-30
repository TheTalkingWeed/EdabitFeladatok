import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigProd(16, 28));
        System.out.println(sumDigProd(0));
        System.out.println(sumDigProd(1, 2, 3, 4, 5, 6));
        System.out.println(sumDigProd(1, 2, 3, 4, 5, 6,45,65,3,234,7,34,1234,4,534,53,45,34,534,5));
    }

    private static int sumDigProd(int... numbers) {
        int result = 0;
        String temp;
        for (int i: numbers){
            result += i;
        }

        while(result > 10){
            temp = Integer.toString(result);
            result = 1;
            for (int i = 0; i < temp.length() ; i++)
                result *= Integer.parseInt(Character.toString(temp.charAt(i)));

        }
        return result;
    }
}