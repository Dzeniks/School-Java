public class Matrix {

  private int[] shape;
  private float[][] matrix;

  public Matrix(int[] shape) {
    this.shape = shape;
    this.matrix = new float[shape[0]][shape[1]];
  }

  public Matrix(int row, int col) {
    this.shape = new int[] { row, col };
    this.matrix = new float[row][col];
  }

  public Matrix(int[] shape, float[][] matrix) {
    this.shape = shape;
    this.matrix = matrix;
  }

  public float get_item(int[] index) {
    int i = index[0];
    int j = index[1];
    return matrix[i][j];
  }

  public float get_item(int index) {
    int row = index / shape[1];
    int col = index % shape[1];
    return matrix[row][col];
  }

  public void set_item(int[] index, float value) {
    int i = index[0];
    int j = index[1];
    matrix[i][j] = value;
  }

  public void set_item(int index, float value) {
    int row = index / shape[1];
    int col = index % shape[1];
    matrix[row][col] = value;
  }

  public float[][] get_matrix() {
    return matrix;
  }

  public int length() {
    return matrix.length;
  }

  public int[] get_shape() {
    return shape;
  }

  public void defineMatric(float[][] matrix) {
    this.matrix = matrix;
  }

  public void fill(float value) {
    for (int i = 0; i < matrix.length; i++) {
      this.set_item(i, value);
    }
  }

  public void showMatrix() {
    for (int i = 0; i < shape[0]; i++) {
      for (int j = 0; j < shape[1]; j++) {
        int index = i * shape[1] + j;
        System.out.print(matrix[index] + " ");
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

  public static Matrix scalar_multiple(float scalar, Matrix a) {
    Matrix result = new Matrix(a.get_shape());
    for (int i = 0; i < result.length(); i++) {
      result.set_item(i, scalar * a.get_item(i));
    }
    return result;
  }

  public static Matrix matrix_multiply(Matrix a, Matrix b) {
    int[] a_shape = a.get_shape();
    int[] b_shape = b.get_shape();
    if (a_shape[1] != b_shape[0]) {
      System.out.println("Matrices cannot be multiplied");
      return null;
    }
    int[] c_shape = { a_shape[0], b_shape[1] };
    Matrix result = new Matrix(c_shape);
    for (int i = 0; i < c_shape[0]; i++) {
      for (int j = 0; j < c_shape[1]; j++) {
        float sum = 0;
        for (int k = 0; k < a_shape[1]; k++) {
          sum += a.get_item(new int[] { i, k }) * b.get_item(new int[] { k, j });
        }
        result.set_item(new int[] { i, j }, sum);
      }
    }
    return result;
  }

  public static float determinant(float[][] matrix2D) {
    int n = matrix2D.length;
    if (n == 1) {
        return matrix2D[0][0];
    } else if (n == 2) {
        return matrix2D[0][0] * matrix2D[1][1] - matrix2D[0][1] * matrix2D[1][0];
    } else {
        float det = 0;
        for (int j = 0; j < n; j++) {
            float[][] submatrix = new float[n-1][n-1];
            for (int i = 1; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    if (k < j) {
                        submatrix[i-1][k] = matrix2D[i][k];
                    } else if (k > j) {
                        submatrix[i-1][k-1] = matrix2D[i][k];
                    }
                }
            }
            det += Math.pow(-1, j) * matrix2D[0][j] * determinant(submatrix);
        }
        return det;
    }
  }
} 