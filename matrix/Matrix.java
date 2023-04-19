import java.util.Scanner;

public class Matrix {

  // 0:x, 1:y, 2:z etc.
  private int[] shape;
  private float[] matrix;

  public Matrix(int[] shape) {
    this.shape = shape;
    this.matrix = new float[shape[0] * shape[1] * shape[2]];
  }

  public float get_item(int[] index) {
    int i = index[0];
    int j = index[1];
    int k = index[2];
    int index_ = k * shape[0] * shape[1] + i * shape[1] + j;
    return matrix[index_];
  }

  public float get_item(int index) {
    return matrix[index];
  }

  public void set_item(int[] index, float value) {
    int i = index[0];
    int j = index[1];
    int k = index[2];
    int index_ = k * shape[0] * shape[1] + i * shape[1] + j;
    matrix[index_] = value;
  }

  public void set_item(int index, float value) {
    matrix[index] = value;
  }

  public float[] get_matrix() {
    return matrix;
  }

  public int length() {
    return matrix.length;
  }

  public int[] get_shape() {
    return shape;
  }

  public void defineMatrix() {
    System.out.println("Enter matrix:");
    Scanner input = new Scanner(System.in);
    for (int k = 0; k < shape[2]; k++) {
      for (int i = 0; i < shape[0]; i++) {
        for (int j = 0; j < shape[1]; j++) {
          int index = k * shape[0] * shape[1] + i * shape[1] + j;
          matrix[index] = input.nextFloat();
        }
        System.out.println();
      }
      System.out.println();
    }
    input.close();
    System.out.println("Matrix defined");

  }

  public void fill(float value) {
    for (int i = 0; i < matrix.length; i++) {
      this.set_item(i, value);
    }
  }

  public void showMatrix() {
    for (int k = 0; k < shape[2]; k++) {
      for (int i = 0; i < shape[0]; i++) {
        for (int j = 0; j < shape[1]; j++) {
          int index = k * shape[0] * shape[1] + i * shape[1] + j;
          System.out.print(matrix[index] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }

  public static boolean compare_shape(Matrix a, Matrix b) {
    if (a.get_shape() != b.get_shape()) {
      System.out.println("Matrices must have the same shape");
      return false;
    }
    return true;
  }

  public static Matrix sum(Matrix a, Matrix b) {
    if (compare_shape(a, b)) {
      Matrix matrix = new Matrix(a.get_shape());
      for (int i = 0; i < matrix.length(); i++) {
        matrix.set_item(i, a.get_item(i) + b.get_item(i));
      }
      return matrix;
    }
    return null;
  }

  public static Matrix sub(Matrix a, Matrix b) {
    if (compare_shape(a, b)) {
      Matrix result = new Matrix(a.get_shape());
      for (int i = 0; i < result.length(); i++) {
        result.set_item(i, a.get_item(i) - b.get_item(i));
      }
      return result;
    }
    return null;
  }

  public static Matrix matrix_multiply(Matrix a, Matrix b) {
    int[] a_shape = a.get_shape();
    int[] b_shape = b.get_shape();
    if (compare_shape(b, b)) {
      int[] c_shape = { a_shape[0], b_shape[1], a_shape[2] };
      Matrix result = new Matrix(c_shape);
      for (int k = 0; k < c_shape[2]; k++) {
        for (int i = 0; i < c_shape[0]; i++) {
          for (int j = 0; j < c_shape[1]; j++) {
            float sum = 0;
            for (int l = 0; l < a_shape[1]; l++) {
              sum += a.get_item(new int[] { i, l, k }) * b.get_item(new int[] { l, j, k });
            }
            result.set_item(new int[] { i, j, k }, sum);
          }
        }
      }
      return result;
    }
    return null;
  }

  public static Matrix scalar_multiple(float a, Matrix matrix) {
    Matrix result = new Matrix(matrix.get_shape());
    for (int i = 0; i < result.length(); i++) {
      result.set_item(i, a * matrix.get_item(i));
    }
    return result;
  }

  public static Matrix transposition(Matrix a) {
    int[] a_shape = a.get_shape();
    int[] b_shape = { a_shape[1], a_shape[0], a_shape[2] };
    Matrix result = new Matrix(b_shape);
    for (int k = 0; k < a_shape[2]; k++) {
      for (int i = 0; i < a_shape[0]; i++) {
        for (int j = 0; j < a_shape[1]; j++) {
          int[] position = { j, i, k };
          float value = a.get_item(new int[] { i, j, k });
          result.set_item(position, value);
        }
      }
    }
    return result;
  }
}