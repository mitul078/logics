
package com.mycompany.first;
import java.util.Scanner;
public class p01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        str = str.replace("\\s" , "").toLowerCase();
        char[] original = str.toCharArray();
        char[] reverse = new char[original.length];
        
        for(int i=0;i<original.length;i++){
            reverse[i] = original[original.length -1 -i];
        }
        
        boolean isTrue = true;
        for(int i=0;i<original.length;i++){
            if(original[i] != reverse[i]){
                isTrue = false; 
                break;
            }
        }
        if(isTrue){
                System.out.println("Its a polindrome word");
            }
            else{
                System.out.println("Its not a polindrome word");
            }
    }
}
