package arraypratice;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr={4,5,6,3,2,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
