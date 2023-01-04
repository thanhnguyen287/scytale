import java.util.*;
import java.io.*;

public class Main {
	public static String encrypt(int rows, String msg) {
		String e = "";
		String[] arr = msg.split("");
		int cols = msg.length()/rows;//len(msg) % rows == 0
		Matrix m = new Matrix(rows,cols);
		
		// Creating initial matrix
		for (int i = 0; i < rows; i++ ) {
			 for (int j = 0; j <cols; j++ ) {
				 m.setElem(i, j, arr[i*cols + j ]);
			 }
		 }
		m.display();
		Matrix h = m.transpose();
		h.display();
		// Get the encrypted message from transposed matrix
		for (int i = 0; i < h.getRows(); i++ ) {
			 for (int j = 0; j < h.getCols(); j++ ) {
				 e = e + h.getElem(i, j);
			 }
		 }
		
		return e;
	}
	public static String decrypt(int rows, String msg) {
		String d = "";
		d = encrypt(msg.length()/rows,msg);				
		return d;
	}
	
	 public static void main(String[] arg){
		 String msg = "well done you cracked the cipher here is the password scytale223";
		 String e = encrypt(4, msg);
		 System.out.print("Cipher created: " + e +"\n");
		 System.out.print(decrypt(4,e));
		 
	 }
}
