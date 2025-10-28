package arraypratice;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr={2,5,6,7,4,3,20};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
