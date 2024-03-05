//package practiceCoding;
import java.io.*;
import java.util.*;

public class Main {
	
	public void myfunction() {
		int n;
				Scanner scan = new Scanner(System.in);
				do{System.out.print("Enter n terms: ");
					n = scan.nextInt();

			}while(n>9);
				
				int num = 0;
				int sum = 0;
				String nine = "1";
				
				int nineInt = 0;
				for(int i=0;i<n;i++){
					num++;
					String con="";
					String cros = " + ";
					for(int j=0;j<num;j++){	
						con += nine;
						
					}
					cros = (i == n-1) ? " " : " + ";
					
					System.out.print(con + cros);
					nineInt = Integer.parseInt(con);
					//System.out.println();
					sum += nineInt;
				}
				
				System.out.println("\n = " + sum);


	}
	
	
	
	public static void main(String[] args) {
		Main man = new Main();
		Compilation compl = new Compilation();
		
		man.myfunction();
		// compl.triangleSideTask();
		
	}
}