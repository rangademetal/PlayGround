package CodeWars;

public class Kata {
    public static String getMiddle(String word) {
        if (word.length() % 2 == 0)
            return word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2);

        return String.valueOf(word.charAt(word.length()/2));
    }

    public static void main(String[] args) {
        String asd="test";
        String asd2="tes";
        System.out.println(getMiddle(asd));
        System.out.println(getMiddle(asd2));
    }
}
