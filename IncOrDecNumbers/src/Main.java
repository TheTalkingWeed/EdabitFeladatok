import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(incDec(0));
        System.out.println(incDec(1));
        System.out.println(incDec(3));
    }

    private static int incDec(int n) {
        int out = 0;
        int interval = (int) Math.pow(10,n);
        for (int i = 1; i <=interval ; i++) {
            if (isInc(i) || isDec(i)) out ++;
        }


        return out;
    }

    private static boolean isInc(int n){
        String snum = Integer.toString(n);
        List<String> splitted = new ArrayList<>(Arrays.asList(snum.split("(?!^)")));
        List<String> ordered = new ArrayList<>(splitted);
        Collections.sort(ordered);
        if (splitted.equals(ordered)) return true;
        return false;
    }

    private static boolean isDec(int n){
        String snum = Integer.toString(n);
        List<String> splitted = new ArrayList<>(Arrays.asList(snum.split("(?!^)")));
        List<String> ordered = new ArrayList<>(splitted);
        Collections.sort(ordered);
        Collections.reverse(ordered);
        if (splitted.equals(ordered)) return true;

        return false;
    }


}