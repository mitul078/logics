
package com.mycompany.first;
import java.util.Scanner;
import java.util.Arrays;
public class p06 {
    public static boolean fns(String str1 , String str2){
        str1 = str1.replace("\\s","").toLowerCase();
        str2 = str2.replace("\\s", "").toLowerCase();
        
        if(str1.length() != str2.length()){
            return false;
        }
        
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1 , ch2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter word: ");
        String str1 = sc.nextLine();
        System.out.println("Enter Word: ");
        String str2 = sc.nextLine();
        
        if(fns(str1,str2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
