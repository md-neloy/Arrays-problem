/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraycollagewallah;
import java.util.HashSet;
public class LargeString {
    static int largeString(String s){
        int count = 0;
        StringBuilder st = new StringBuilder(s);
        for(int i = 0; i<st.length();i++){
            for (int j = i; j <st.length(); j++) {
            StringBuilder newst = new StringBuilder();
                for (int k = i; k <=j; k++) {
                    newst.append(st.charAt(k));
                }
                StringBuilder temp = new StringBuilder(newst);
                newst.reverse();
//                System.out.print("temp: "+temp);
//                System.out.println(" after reverse: "+newst);
                if(temp.toString().equals(newst.toString()) && newst.length()>count){
                    System.out.println(" after r everse: "+newst);
                    count= newst.length();
                }
            }
        }

        return count;
    }
    public int longestPalindrome(String s) {
        int count = 0;
        if(s.length()== 0){
            return count;
        }
        HashSet <Character> hs = new HashSet <>();
        for(int i = 0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else hs.add(s.charAt(i));
        }
        
        return count *2 + (hs.isEmpty()? 0:1);
    }
    public static void main(String[] args) {
        int num = largeString("dbabbabb");
        System.out.println(num);
    }
}
