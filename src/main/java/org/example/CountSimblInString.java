package org.example;

public class CountSimblInString {
    public static void main(String[] args) {
        String str = "Hello word!";
        System.out.println(countSimblString(str));
    }
    public static int countSimblString (String str){
        int count = 0;
        for (Character c: str.toCharArray()) {
            if (Character.isLetter(c)){
                count ++;
            }
        }

        return count;
    }
}
