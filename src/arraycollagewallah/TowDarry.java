
package arraycollagewallah;

public class TowDarry {
    static int sumof2D(int[][]arr){
        int row = arr.length;
        int col = arr[0].length;
        System.out.println("col:"+col);
        int maxsum = 0;
        int r= 0;
        for (int i = 0; i <row; i++) {
            int sum = 0;
            for (int j = 0; j <col; j++) {
               sum += arr[i][j]; 
            }
            if(maxsum<sum){
                maxsum = sum;
                r = i;
            }
        }
        return r;
    }
    static int[][] multiply(int[][] arr1, int[][] arr2){
        int m = arr1.length;
        int n = arr1[0].length;
        int p = arr2.length;
        int q = arr2[0].length;
        int newarr[][] = new int[m][q];
        if(n!=p){
            return newarr;
        }else{
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    int sum = 0;
                    for (int k = 0; k < n; k++) {
                       sum += arr1[i][k]*arr2[k][j];  
                    }
                    newarr[i][j] = sum;
                }
            }
  
        return newarr;
        }
        
    }
    public static void main(String[] args) {
        int[][] arr= new int[][]{
            {1,0,0},{0,1,0},{0,0,1}
        };
        int[][] arr2= new int[][]{
            {1,0,0},{0,1,0},{0,0,1}
        };
        //System.out.println("row no: "+sumof2D(arr));
        String name = "mahmudul";
        String n = Character.toString(name.charAt(0));
        System.out.println(name.contains(String.valueOf(name.charAt(0))));
        int [][] arr3 = multiply(arr,arr2);
        System.out.println("multiply of array is: ");
        for(int[] x: arr3){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
