package arraypratice;

import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-1,-4,-79,-73,-2};
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx)
                mx=arr[i];


        }
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smx && arr[i] != mx) smx=arr[i];

        }
        System.out.println(smx);
    }
}