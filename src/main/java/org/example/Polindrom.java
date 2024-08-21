package org.example;

public class Polindrom {
    public static void main(String[] args) {
        //проверка на полиндром
        String x = "12121";
        System.out.println(isPolindromString(x));

        int[] x1 = {1,2,1,2,1};
        System.out.println(isPolindromIntArr(x1));

        int x3 = 12121;
        System.out.println(isPolindromInt(x3));

        // поворот строки

        //Развернуть произвольную строку без использования методов типа reverse() и split() и при этом используя один массив

    }
    public static boolean isPolindromString(String x) {


        for (int i = 0; i < x.length() / 2; i++) {

            if (x.charAt(i) != x.charAt(x.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }
    public static boolean isPolindromIntArr(int[] x) {
        for (int i = 0; i < x.length / 2; i++) {

            if (x[i] != x[x.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPolindromInt(int x3) {
        String str = Integer.toString(x3);
        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
