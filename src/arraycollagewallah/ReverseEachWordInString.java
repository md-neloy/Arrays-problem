
package arraycollagewallah;
import java.util.Scanner;
public class ReverseEachWordInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        String ans = "";
        String demo[] = st.split(" ");
        for(int i = 0; i<demo.length; i++){
            String x = demo[i];
            for (int j = x.length()-1; j>=0; j--) {
                ans += x.charAt(j);
            }
            ans+= " ";
        }
        System.out.println(ans);
    }
}
