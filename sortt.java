package arraypratice;

public class sortt {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 0, 1, 0};
        int n = arr.length;
        int noOfzeros = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                noOfzeros++;

            }
        }
        for (int i = 0; i < n; i++) {
            if (i < noOfzeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
}