public class Main {
    public static void main(String[] args) {
        System.out.println(wordprocessor(10, 7, "hello my name is Bessie and this is my essay"));
    }

    private static String wordprocessor(int numofwords,int linelength,String string){
        StringBuilder result = new StringBuilder();
        int currlen = 0;
        String[] words = string.split(" ");

        for(int i = 0;i < numofwords;i++){

            currlen += words[i].length();

            if (currlen <= linelength){
                result.append(words[i]);
                result.append(" ");
            }else {
                result.append("\n");
                result.append(words[i]);
                result.append(" ");
                currlen = words[i].length();
            }

        }
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '\n'){
                result.deleteCharAt(i-1);
            }
        }


        return result.deleteCharAt(result.length()-1).toString();
    }


}