import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {

        int[] ar = {-8, -5, -3, 0, 1, 4, 5, 8, 9, 10, 11};
        int[] arC = {1, -8, -3, 0, -5, 4, 8, 5, 11, 9, 10};

        System.out.println("Hello, World!");
        System.out.println(ar);
        System.out.println(arC);
        System.out.println(QuickSort(arC));
    }

    public static int[] QuickSort(int[] arr){
        int pivot = arr.length / 2;
        int l = 0;
        int r = arr.length;

        while (l == r){
            // Left
            for (int i = l; l < arr.length; l++){
                // Swap
                l++;
                if (arr[pivot] > arr[l]){
                    int temp = arr[l];

                    arr[l] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }

            // Right
            for (int i = r; i > 0; i--){
                // Swap
                r--;
                if (arr[pivot] < arr[r]){
                    int temp = arr[r];

                    arr[r] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }
        }

        return arr;
    }


    public static void QuickSortSwap(int[] arr){

    }

}

