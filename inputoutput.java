package arraypratice;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
