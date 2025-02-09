
package com.mycompany.first;
import java.util.Scanner;
public class p03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int temp=0;
        
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                temp++;
                break;
            }
        }
        if(temp == 0&& num!=1){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        
    }
}
