package CodeWars;
// https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
public class Solution {

    public static boolean validatePin(String pin) {
        if (pin.length() == 4 || pin.length() == 6)
            return pin.matches("\\d+");
        return false;
    }
}