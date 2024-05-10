/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraycollagewallah;
import java.util.Scanner;
import java.util.Arrays;
public class Array {
 
    public static void main(String[] args) {
        int [] arr = new int[]{900,200,3,4,109,800,16,8,14,101,850};
        System.out.println("Find the First , Second & Third value from the array: ");
        int max = arr[0];
        int NextMax = arr[0];
        int thirdmax = NextMax;
        for (int i = 0; i < 11; i++) {
            if(max<arr[i]){
                thirdmax = NextMax;
                NextMax = max;
                max = arr[i];
            }else if(NextMax == max || NextMax<arr[i]){
                thirdmax = NextMax;
                NextMax = arr[i];
            }else if(thirdmax<arr[i]&&thirdmax<NextMax){
                thirdmax = arr[i];
            }
            
        }
        System.out.println("Max: "+max);
        System.out.println("Seoncd: "+NextMax);
        System.out.println("Third: "+thirdmax);
        }
    
}
