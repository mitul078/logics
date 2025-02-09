
package com.mycompany.first;
import java.util.Scanner;
public class p05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five values: ");
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int b[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            b[i] = arr[arr.length -i - 1];
        }
        for(int i: b){
            System.out.print(i+ " ");
        }
    }
}
