package arraypratice;

public class sort012 {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,2,2,1,1,2,1,0};
        int n=arr.length;
        int noOfZeros=0;
        int noOfOne=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                noOfZeros++;
            }
            if (arr[i] == 1) {
                noOfOne++;
            }
        }
            for(int i=0;i<n;i++){
                if(i<noOfZeros) arr[i]=0;
                else if(i<noOfOne+noOfZeros) arr[i]=1;
                else arr[i]=2;

            }
        }
    }

