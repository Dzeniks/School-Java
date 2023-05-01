import java.util.Arrays;

public class Main{
  public static void main(String[] args) {
    
    float[][] matrixArray = {
      {2, 1, -1, 8},
      {-3, -1, 2, -11},
      {-2, 1, 2, -3}
    };
    int[] shape = {4, 3};
    Matrix matrix = new Matrix(shape, matrixArray);
    System.out.println(Matrix.determinant(matrixArray));
    float[] solution = Matrix.solveSystemOfEquations(matrix);
    System.out.println(Arrays.toString(solution));
  }
}



