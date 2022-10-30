public class Main {
    public static void main(String[] args) {
        System.out.println(additivePersistence(1679583));
        System.out.println(additivePersistence(123456));
        System.out.println(additivePersistence(6));
        System.out.println(multiplicativePersistence(77));
        System.out.println(multiplicativePersistence(123456));
        System.out.println(multiplicativePersistence(4));

    }


    private static int additivePersistence(int a) {
        int result = 0;
        String temp;
        while(a >= 10){
            temp = Integer.toString(a);
            a = 0;
            for (int i = 0; i < temp.length() ; i++)
                a += Integer.parseInt(Character.toString(temp.charAt(i)));
            result ++;
        }


        return result;
    }
    private static int multiplicativePersistence(int a) {
        int result = 0;
        String temp;
        while(a > 10){
            temp = Integer.toString(a);
            a = 1;
            for (int i = 0; i < temp.length() ; i++)
                a *= Integer.parseInt(Character.toString(temp.charAt(i)));
            result ++;
        }


        return result;
    }
}