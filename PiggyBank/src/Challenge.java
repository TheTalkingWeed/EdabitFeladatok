public class Challenge {

    public static int NumberOfDays(int cost,int saving,int start){
        int days = 0;
        int dow = 1;
        int temp = start;
        while (cost >= saving){
            saving += start;
            start ++;
            dow++;

            if (dow == 7){
                temp++;
                start = temp;
                dow = 0;

            }
            days++;
        }
        return days;
    }
}
