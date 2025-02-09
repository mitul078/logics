
package com.mycompany.first;
import java.util.Scanner;
public class p02 {
    public static int fns(int index){
        if(index <= 1){
            return index;
        }
        else{
            return fns(index-1) + fns(index-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.print(fns(i)+ " ");
        }
    }
}
