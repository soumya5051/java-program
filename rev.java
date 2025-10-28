package arraypratice;

public class rev {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        for(int i=0;i<=4;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=4;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
