package arraypratice;
import java.util.Arrays;
public class sorttt {
    public static void main(String[] args) {
        int[] arr={1,6,3,2,5,9};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
