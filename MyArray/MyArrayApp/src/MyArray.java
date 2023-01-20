import java.util.Arrays;

public class MyArray {

    private int[] arr;

    // public MyArray(int[] arr) {
        // this.arr = arr;
    // }

    public MyArray(int len) {
        this.arr = new int[ len ]; 
    }

    public int[] getArray(){
        return arr;
    }

    public void add(int n){
       int i = arr.length + 1;
       int newarr[] = new int[i];
       newarr[i - 1] = n;
       arr = newarr;
    }

    public void index(int i, int n){
        arr[i] = n;
    }
    
    public void BubbleSort(){
        int i, j, temp;
        int length = arr.length;
        boolean swap;
        for (i = 0; i < length - 1; i++)
        {
            swap = false;
            for (j = 0; j < length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false){break;}
        }
    }

    public int max(){
        int max = arr[0];
        for (int i : arr) {
            if (max < i ){
                max = i;
            }
        }
        return max;
    }

    // public int max(){
    //     BubbleSort();
    //     return arr[arr.length - 1];
    // }

    @Override
    public String toString() {
        return "MyArray" + Arrays.toString(arr) + "";
    }
}
