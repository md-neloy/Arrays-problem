
package arraycollagewallah;

public class StringCompreesed {
    public static int compresedString(char ch[]){
        int index = 0;
        int count = 1;
        for (int i = 1; i <=ch.length; i++) {
            if(i<ch.length&& ch[i]== ch[i-1]){
                count++;
            }else{
               ch[index++] = ch[i-1];
               if(count>1){
                   char demo[] = String.valueOf(count).toCharArray();
                   for(char x: demo){
                      ch[index++] = x; 
                   }
                   count =1;
               }
            }
        }
        
        return index;
    }
    public static void main(String[] args) {
        char ch[] = {'a','a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int num = compresedString(ch);
        System.out.println("length: "+num);
        System.out.println(ch[5]);
    }
}
