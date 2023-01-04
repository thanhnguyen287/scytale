
import java.util.*;

public class Matrix {
	String[][] data = null;
    private int rows = 0, cols = 0;
    
    public Matrix(int r, int c) {
        data = new String[r][c];
        rows = r;
        cols = c;
    }
    
    public Matrix transpose() {
        Matrix result = new Matrix(cols, rows);
        
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++) 
                result.data[j][i] = data[i][j];
        return result;
    }
    
    public void display() {
        System.out.print("[");
        for (int i = 0; i < rows; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            
            System.out.print("[");
            
            for (int j = 0; j < cols; j++) {
                System.out.printf("%s", data[i][j]);
                
                if (j != cols - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("]");
            
            if (i == rows - 1) {
                System.out.print("]");
            }
            
            System.out.println();
        }
        System.out.println();
    }
    public void setElem(int i, int j, String b) {
        data[i][j] = b;
    }
    
    public int getRows() {
        return rows;
    }
    
    public int getCols() {
        return cols;
    }
    
    public String getElem(int i, int j) {
        return data[i][j];
    }
}
