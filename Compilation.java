//package practiceCoding;

import java.util.Scanner;

//Note for those who watch or for the future me. This no make sense especially the naming of variables and no AI is involve therefore code might not efficient enough to incorporate it in bigger projects.
//This is only a practice to enhance coding ability and a little past time as it is probably made by the author without internet connection
//And reminder code might not be aesthetic as it looks in the command but its working.
public class Compilation {
	
	public void firsDayTask() {//#2
		int n = 10; // the size
				
				int res = 0;
				int total[] = new int[n]; // initializing the array
				int m = 0;
				 
				for(int i=0;i<n;i++) {// loop for assigning value for the array
					res = i;// I just put this for no reason
					m += 1;// I put m for the value to start to 1 instead of traditional 0
					total[i] = m;// this part is where the value is put
					System.out.print(res + ". ");// for debugging purposes
					
				}
				
			System.out.print("\n");
			int sum = 0;
			for(int j=0; j<total.length; j++) { // loop for displaying the array and also all the value
				System.out.print(total[j] + " ");
				sum += total[j];//this is the alternative |sum = sum + total[j];|// summing the value
				
				
			}
			
			
			System.out.print("\n" + sum);
	}
	
	public void secondTask() {// # 4

		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter number: ");
		
//		int name = scan.nextInt();
		int n = 5;
		Double inputNum[] = new Double[n];
		int m= 0;
		int sum = 0;
		
		for(int i=0; i<n;i++) {
			m+=1;
			System.out.print("Enter input "+ m +": ");
			inputNum[i]= scan.nextDouble();
			sum += inputNum[i];
		}
		int average = sum/n;
		System.out.println("The Sum is: " +sum);
		System.out.println("The Average is: " +average);
		
	}
	
	public void thirdTask() {// # 5
		//Note no backspace option here in eclipse it does not recognize
				//System.out.println(Math.pow(a,3));
				
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter number of terms: ");
				
				
				int numT = scan.nextInt();
				int m= 0;
				
				for(int i=0; i<numT; i++) {
					m += 1;
					System.out.print("Enter number "+ m + ": ");
					int number = scan.nextInt();
					int cube = (int) Math.pow(number,3);// this line is for getting the cube
					System.out.print(" \tand the cube is " + cube + "\n");
					
				}
	}
	
	public void fourthTask() {//#6 || this is a simple multiplication table only enable one number

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input the number to be calculated: ");
		int n = scan.nextInt();
		
		int m= 0;
		for(int i=0;i<10;i++) {
			m+=1;
			System.out.println(n + " x " + m + " = "+ (n*m));
			
		}
		
	}
	
	public void fiftTask() {// #7 this is a full functional periodic table
		Scanner scan = new Scanner(System.in);		
		System.out.print("Input up the table number starting from 1 : ");
		int n = scan.nextInt();		
		int k = 0;
		int m = 0;
				for(int j=0; j<10; j++) {					 
					k+=1;					
						for(int i=0;i<n;i++) {							
							m += 1;
								System.out.print(k + " x " + m + " = "+ (m*k));	
								if(m == n) {
									System.out.print(" ");
								}else {
									System.out.print(", ");
								}
							}						
					m = 0;						
					System.out.println();
				}
				
	}
	
	public void sixtTask() {//#8 half triangle for loop
	int bilang = 10;
		
		int num = 0;// if you want a half and inverted triangle just change this to value of bilang and make num-- instead
		int num2= 0;// just for no reason just ignore this one
		for(int i=0;i<bilang;i++) {
			String a= "*";
			String b = " ";// also this one just ignore it
			num++;
			for(int j=0;j<num;j++) {
				System.out.print(a);
				
			}
			
			System.out.println();
		}
	}
	
	public void triangleSideTask() {
			int bilang = 20;
					
					int num = 0;
					int num2= bilang;
					int num3 = 0;
					for(int i=0;i<bilang;i++) {
						String a= "*";
						String b = " ";
						
						num++;
						num2--;
						num3++;
						for(int k=0;k<num2;k++) {
							System.out.print(b);
							
						}
						for(int j=0;j<num;j++) {
							System.out.print(a);				
						}
						for(int l=0;l<num3-1;l++) {
							System.out.print(a);				
						}
						
						
						
						System.out.println();
					}
	}
	
	
	public void seventhTask() {//8 it display the odd number and sum all their value 
		
		int m= 0;
		int n = 40;
		int sum=0;
		int total[] = new int[n]; 
		
		for(int i=0;i<n;i++) {
			
		
			
			System.out.print(m +" ");
			total[i] = m;
			m+=2;
			
			sum += total[i];
			//System.out.print("|'"+sum +"'|, ");
			
		}
		System.out.println();
		System.out.println(sum);
	}
	

	public void eightTask() {//#10 right triangle with number
		int bilang = 10;
		
		int num = 0;// if you want a half and inverted triangle just change this to value of bilang and make num-- instead
		int num2= 0;// just for no reason just ignore this one
		for(int i=0;i<bilang;i++) {
			int a= 1;
			String b = " ";// also this one just ignore it
			num++;
			for(int j=0;j<num;j++) {
				System.out.print(a++);
				
			}
			a=0;
			System.out.println();
		}
	}
	
	public void nineTask() {//#11 right angle triangle with a number which will repeat a number in a row.
		int bilang = 9;
		
		int num = 0;
		int num2= 0;
		int a= 0;
		for(int i=0;i<bilang;i++) {
			
			a++;
			num++;
			
			for(int j=0;j<num;j++) {
				System.out.print(a);
				
			}
			
			System.out.println();
			
		}
	}
	
	
	public void tenthTask() {// #12 rigth angle triangle with the number increase by 1
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
	
	public void eleventTask() {// # 13 & 14 pyramid with asterisk or number increase by 1
		int bilang = 20;
			
			int num = 0;
			int num2= bilang;
			//int num3 = 0;
	//		int a= 1;
			String a = "*";
			for(int i=0;i<bilang;i++) {
				
				String b = " ";
				
				num++;
				num2--;
				
				for(int k=0;k<num2;k++) {
					System.out.print(b);
					
					
				}
				for(int j=0;j<num;j++) {
					System.out.print(a+" ");	
					//a++;
				}
		
				System.out.println();
			}
	}
	
	public void twelveTask() {//#15 calculate the given factorial of a given number
		int n = 10;
		int m = 0;
		int sum = 1;
		for(int i=0; i<n; i++) {
			m++;
			System.out.print(m + " ");
			
			sum= sum* m;
			//System.out.print("|"+sum + "| ");
		}
		System.out.println("\n"+ sum);
	}
	
	public void dutertenTask() {//#17 pyramid pattern with a number that will repeat the number in the same row
int bilang = 20;
		
		int num = 0;
		int num2= bilang;
		//int num3 = 0;
		int a= 0;
		//String a = "*";
		for(int i=0;i<bilang;i++) {
			
			String b = " ";
			
			num++;
			num2--;
			a++;
			for(int k=0;k<num2;k++) {
				System.out.print(b);
				
				
			}
			for(int j=0;j<num;j++) {
				System.out.print(a+" ");	
				
			}
	
			System.out.println();
		}
	}
	
	
	public void fourtenTask() {// #19 display the n terms of a harmonic series and their sum
		
		int n = 5;
		
		Double sum = 0d;
		Double m=0d;
		for(int i=0;i<n;i++) {
			m++;
			
			sum = sum + (1/m) ;
			System.out.print("1/" + m + " + ");
			
			
		}
		System.out.println(" \n"+sum);
		
	}
	
	public void fifteenTask() {//# pyramid pattern using asterisks, with each row containing an odd number of asterisks
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
						if((bc%2) == 0) {
							System.out.print(" ");	
						}else {
							System.out.print(a+" ");
						}
							
						
					}
			
					System.out.println();
				}		
	}
	
	
	
}
