package arraypratice;

import java.util.Scanner;

public class findx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ntr target elemnt");
        int x=sc.nextInt();
        System.out.print("enter array size");
        int n=sc.nextInt();
        System.out.print("enter array elemnts");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
               flag=true;
               break;
            }
        }
        if(flag==true){
            System.out.println("found");
        }
        else{
            System.out.println("not");
        }
    }
}
