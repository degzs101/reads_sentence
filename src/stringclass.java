import java.util.Scanner; // import scanner


public class stringclass {// setup class

		public static void main(String[] args) {	


			
			Scanner scanner = new Scanner(System.in);	// new scanner
			System.out.println("Please enter a sentence"); /// enter sentence	
			String sentence = scanner.nextLine();
			
		// setup method
			String upperCaseName = sentence.toUpperCase(); // convert sentence into capitals and normal letters 
	         String lowerCaseName = sentence.toLowerCase();

			 System.out.print(" convert results : \n " + upperCaseName + "\n"  + lowerCaseName + "\n");
			 // print out  in caps and normal letter
			String [] tokens = sentence.split(" ");	// tokenize the	sentence and display individual token
			for (String token : tokens)	
					System.out.println(token); // print out every token (word)
		} // close method and class
}

