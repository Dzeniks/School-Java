public class App {
    public static void main(String[] args) throws Exception {
        
        // Nepochopil jsem co chcete v konstrouktoru v classe MyArray,
        // takže jsem vytvořil dvě možnosti jednu na vytvoření z existujicího arraye druhá si array vytvoří sama ze zadané délky

        // int[] arr = {1,2,3,4,5}; 
        // MyArray myArr = new MyArray(arr);

        MyArray myArr = new MyArray(5);
        myArr.add(5);
        myArr.index(0, 1);


        System.out.printf("\nClass MyArray: %s", myArr);
        System.out.printf("\nMax classe MyArray: %s", myArr.max());

        System.out.printf("\nMin: %s", arrMin(myArr.getArray()));
        System.out.printf("\nAverage: %.2f", arrAvg(myArr.getArray()));
    }

    public static int arrMin(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if (min > i ){
                min = i;
            }
        }
        return min;
    }

    public static float arrAvg(int[] arr){
        float avg = 0;
        for (int i : arr) {
            avg += i;
        }
        return (avg/arr.length);
    }
}
