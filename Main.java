//package practiceCoding;
import java.io.*;
import java.util.*;

public class Main {
	
	public void myfunction() {
		int bilang = 20;
		
		int num = 0;
		int num2= bilang;
		//int num3 = 0;
//		int a= 0;
		int bc=0;
		String a = "*";
		for(int i=0;i<bilang;i++) {
			
			String b = " ";
			
			num++;
			num2--;
			//a++;
			bc++;
			for(int k=0;k<num2;k++) {
				System.out.print(b);
				
				
			}
			for(int j=0;j<num;j++) {
				if((bc%2) == 2) {
					System.out.print(" ");	
				}else {
					System.out.print(a+" ");
				}
					
				
			}
	
			System.out.println();
		}
	
		
		
	}
	
	
	
	public static void main(String[] args) {
		Main man = new Main();
		Compilation compl = new Compilation();
		
		man.myfunction();
		//compl.fifteenTask();
		
	}
}