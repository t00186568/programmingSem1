import java.util.Scanner;
public class ca2Group3 {

	public static void main(String[] args) {
		
		String input, listValid="";
		int charLength=0, invalid=0,i,digits,count=0; 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a first ISBN (q to exit): ");
		input = scanner.nextLine();
		
		while(!input.equals("q")){
			count++;
				
			if(input.length()==10){
				
				i=0;
				digits=0;
				
				while(i<9){
					if(input.charAt(i)>='0' || input.charAt(i)<='9'){
						digits++;
						i++;
						
					}
					
				if(digits==9){
					if(input.charAt(9)>='0' && input.charAt(9)<='9' || input.charAt(9)=='X'){
						System.out.print("congrats");
						listValid += input;
						listValid += " ";
						count++;
					} else {
						System.out.print("Invalid entry");
						invalid++;
					}
					
				}
			}
		}

	}

}
	
}
