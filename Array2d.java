package arraypratice;

public class Array2d {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        arr[0][0]=9;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
