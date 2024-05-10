/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraycollagewallah;

public class Palindrom {
  static boolean palindrom(int n){
      String temp = Integer.toString(n);
      String num1 = "";
      //String num2 = "";
      int i = 0;
      int len = temp.length()-1;
      while(len>=i){
         num1 = num1+temp.charAt(len);
         len--;
      }
      System.out.println(num1);
      //i = 0;
      len = temp.length()-1;
      System.out.println("i = "+i);
      System.out.println("len = "+len);
      while(i<len){
          System.out.println("hi");
          if(temp.charAt(i)!= num1.charAt(len)){
              return false;
          }
          i++;
          len--;
      }
     
       return true;
  }  
    public static void main(String[] args) {
        System.out.println( palindrom(5283));
    }
}
