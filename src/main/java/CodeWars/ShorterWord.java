package CodeWars;

public class ShorterWord {
    public static int findShort(String s) {
        String[] arr= s.split(" ");
        int min = arr[0].length();
        for(String splt :arr) {
            if(min >splt.length())
                min = splt.length();
        }
        return min;
    }
}
