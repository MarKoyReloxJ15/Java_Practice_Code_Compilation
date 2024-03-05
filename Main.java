//package practiceCoding;
import java.io.*;
import java.util.*;

public class Main {
	
	public void myfunction() {
		int bilang = 14;
		
		int num = 0;
		int num2= 0;
		int a= 1;
		for(int i=0;i<bilang;i++) {
			
			
			num++;
			
			for(int j=0;j<num;j++) {
				System.out.print(a);
				a++;
			}
			
			System.out.println();
			
		}
	}
	
	
	
	public static void main(String[] args) {
		Main man = new Main();
		Compilation compl = new Compilation();
		
		man.myfunction();
		// compl.eightTask();
		
	}
}