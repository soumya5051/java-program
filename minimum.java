package arraypratice;

public class minimum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,-5,4};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=Math.min(min,arr[i]);
            }
        }
        System.out.println(min);
    }
}
