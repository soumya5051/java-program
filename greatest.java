package arraypratice;

public class greatest {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,9,37};
        int max=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=Math.max(max,arr[i]);
            }
        }
        System.out.println(max);
    }
}
