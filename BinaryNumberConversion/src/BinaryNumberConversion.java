import java.util.Scanner;

public class BinaryNumberConversion {
	
	public static void convertNumber() {
		System.out.println("Welcome to binary!");
		Scanner input = new Scanner (System.in);
		int decimal = 0;
		long binary = 0;
		System.out.print("What would you like to enter, binary or decimal? ");
		String response = input.nextLine();
		if(response.equals("decimal")) {
			System.out.print("Enter number to be converted to binary: ");
			decimal = input.nextInt();
			System.out.println("Here is "+decimal+" in binary: "+convertToBinary(decimal).toString());
		} else if (response.equals("binary")){
			System.out.print("Enter number to be converted to decimal: ");
			binary = input.nextLong();
			System.out.println("Here is "+binary+" in decimal: "+convertToDecimal(binary));
		} else {
			System.out.println("please enter another number");
		}
		
		
		
	}
	
	private static StringBuilder convertToBinary(int decimal) {
		StringBuilder binary = new StringBuilder ("");
		while(decimal!=0) {
			if(decimal%2==0) {
				binary = binary.insert(0, '0');
				System.out.println(decimal +"/2 = "+(decimal/2)+" R 0");
				
			} else {
				binary = binary.insert(0, '1');
				System.out.println(decimal +"/2 = "+(decimal/2)+" R 1");
			}
			decimal = decimal/2;
		}
		return binary;
	}
	
	private static int convertToDecimal(long binary) {
		int index = 0;
		int decimal = 0;
		while(binary!=0) {
			decimal += (binary%10)*Math.pow(2, index);
			if(binary%10 == 1) {
				System.out.print("2^"+index+" + ");
			}
			binary = binary/10;
			index++;
		}
		return decimal;
	}
	
	public static void main (String [] args) {
		Scanner input2 = new Scanner (System.in);
		boolean go = true;
		while(go == true) {
			convertNumber();
			
			System.out.print("Again? ");
			if(input2.hasNext()) {
				String response =input2.nextLine();
				if(response.equals("no")) {
					go = false;
				}
			}
			
				
		}
		System.out.println("thanks for playing");
		
	}
		

}
