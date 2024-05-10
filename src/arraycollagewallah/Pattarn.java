
package arraycollagewallah;

public class Pattarn {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n; i++) {
            char ch = 64;
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                if(j<=i){
                    ch++;
                    System.out.print(ch);
                    
                }else{
                    ch--;
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
        StringBuilder st = new StringBuilder("hello");
        String s = "hello";
        char ch = s.charAt(0);
        char low = Character.toUpperCase(ch);
            s += low;
            System.out.println(s.substring(3,4));
    }
}
