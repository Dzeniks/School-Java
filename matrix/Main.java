public class Main{
  public static void main(String[] args) {
    
    float[][] matrixArray = {{11, 1, 1}, {2, 12, 2}, {2, 2, 13}};
    int[] shape = {3, 3};
    Matrix matrix = new Matrix(shape, matrixArray);
    System.out.println(Matrix.determinant(matrixArray));
  }
}



