package de.telran.Melkonov.Oleg.hw20230831;

public class StringOfBrackets {
    public static char bracketOpen = '(';
    public static char bracketClose = ')';

    public static String validString = "()()()()()()()()()";
    public static String inValidString = "((()))(()()(((()(()";

    public static boolean checkString(char[] charString){
        int i = 0;
        while(charString[i] == bracketOpen && charString[i+1] == bracketClose || i < charString.length-1){
            if (charString[i] != bracketOpen && charString[i+1] == bracketClose || charString[i] == bracketOpen && charString[i+1] != bracketClose) {
                System.out.println("The string is INVALID!");
                return false;
            }
            i++;
        }
            System.out.println("The string is VALID!");
            return true;
    }

    public static void main(String[] args) {
        char[] validStringInChars = validString.toCharArray();
        char[] inValidStringInChars = inValidString.toCharArray();
        checkString(validStringInChars);
        System.out.println("------------------------------");
        checkString(inValidStringInChars);

    }
}
