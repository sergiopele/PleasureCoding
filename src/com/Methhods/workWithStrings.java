package com.Methhods;


public class workWithStrings {
    void print() {
        System.out.println("gdg");
    }
    
    public static void main(String[] args) {
        //reverseWord("reverse");
        palindrome("Dad");
        
    }
    
    private static void reverseWord(String str) {
        String[] newstr = str.split(" ");
        for (int i = 0; i < newstr.length; i++) {
            String word = newstr[i];
            StringBuilder sb = new StringBuilder(word);
            sb = sb.reverse();
            newstr[i] = sb.toString();
            System.out.print(newstr[i] + " ");
        }
    }
    
    private static void palindrome(String str1) {
        
        StringBuilder sb1 = new StringBuilder(str1);
        sb1.reverse();
        if (sb1.toString().equalsIgnoreCase(str1)) {
            System.out.println("The String is Palindrome");
        } else {
            System.out.println("The String is not");
        }
    }
}