package arraypratice;
import java.util.Arrays;
public class sor {
    public static void main(String[] args) {
        int[] arr={1,2,6,8,3,0,4};
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
