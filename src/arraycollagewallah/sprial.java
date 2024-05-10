
package arraycollagewallah;

public class sprial {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{4,5,6,7},{7,8,9,8}};
        int minr = 0;
        int maxr = arr.length-1;
        int minc = 0;
        int maxc = arr[0].length-1;
        int len = (maxr+1)*(maxc+1);
        for(int i = 0; i<len;){
            for(int j = minc; j<=maxc; j++){
                System.out.print(arr[minr][j]);
                i++;
            }
            minr++;
            if(i==len){
                break;
            }
            for(int j = minr; j<=maxr; j++){
                System.out.print(arr[j][maxc]);
                i++;
            }
            maxc--;
            if(i==len){
                System.out.println("hi");
                break;
            }
            for(int j = maxc; j>=minc; j--){
                System.out.print(arr[maxr][j]);
                i++;
            }
            maxr--;
            if(i==len){
                break;
            }
            for(int j = maxr; j>=minr; j--){
                System.out.print(arr[j][minc]);
                i++;
            }
            minc++;
        }
    }
 
}
