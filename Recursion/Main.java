public class Main{

    public static void main(String[] args){

        System.out.printf("Exponent %s\n", ExpRec(2, 2));
        System.out.printf("Factorial %s\n", FacRec(2));
        BinRec(2 );
    }


    public static int ExpRec(int n, int exp){
        if (exp < 1){
            return 1;
        }
        return n * ExpRec(n, exp-1);
    }


    public static int FacRec(int n){
        if (n < 1){
            return 1;
        }
        return n * FacRec(n - 1);
    }

    public static void BinRec(int n){
        if (n > 0) {
            BinRec(n/2);
            System.out.printf("%s", n%2);
        }
    }
}