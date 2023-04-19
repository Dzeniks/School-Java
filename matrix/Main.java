public class Main{
  public static void main(String[] args) {
    
    int[] shape = {2, 2, 1};

    Matrix a = new Matrix(shape);
    a.defineMatrix();
  
    Matrix b = new Matrix(shape);
    b.fill(6);
    Matrix.sub(a, b).showMatrix();
    Matrix.sum(a, b).showMatrix();
    Matrix.matrix_multiply(a, b).showMatrix();
    Matrix.scalar_multiple(20, a).showMatrix();
  }
}



