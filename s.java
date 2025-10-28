package arraypratice;
import java.util.Arrays;
public class s {
    public static void main(String[] args) {
        int[] arr={5,2,3,9,1,};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
