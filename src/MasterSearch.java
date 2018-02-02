// getting classes from the utilities package and the input-output package
import java.util.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.io.PrintWriter;

public class MasterSearch{
	public static void main(String[] args) throws Exception {
		
		// Organizing the two files
		java.io.File file = new java.io.File("example document.txt");
		java.io.File nextFile = new java.io.File("second example.txt");
		System.out.println("\n Here we can see the file is present, " + file.exists() );
		System.out.println("\n Here we can see the file is present, " + file.getAbsolutePath() );
		System.out.println("\n it was real here we go ");
		System.out.println("\n Is this file a file? " + file.isFile());
		
		// script in order to manage files
		if( file.exists() && nextFile.exists() ){
			try(
				Scanner readingFile = new Scanner(file);
				PrintWriter writingFile = new PrintWriter(nextFile);) 
			{
				// Reading the file5
				while (readingFile.hasNext() ){
					String initialLine = readingFile.nextLine();
					Matcher regularExpressions = Pattern.compile("(\\d\\w+)(\\w{2})").matcher(initialLine);
					Matcher regularExpressions2 = Pattern.compile("(7.*7)").matcher(initialLine);
					// System.out.println(" this is the group count: " + regularExpressions.groupCount());
					if (regularExpressions.find() && regularExpressions2.find()){
						System.out.println(" this is the group count: " + regularExpressions.group(0));
						System.out.println(" this is the group count: " + regularExpressions2.group(0));
					}
				
				}
				
		// THIS HAS ACTUALLY GOT TO DO WITH THE OTHER LAMBDA		
		int[] uniformList = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5};
		int[] binaryList = {1, 1, 1, 2, 2, 7, 7, 9, 10, 11};
		int data = 4;
		int firstFind = 0;
		
		int beginningIndex = 0;
		int endingIndex = uniformList.length - 1;
		// interpolated calculations
		int howManyUnits = data -  uniformList[0] ;
		int elements  = (endingIndex - beginningIndex) ;
		// System.out.println(" This is the element" + elementsPerUnit ) ;
		int range = uniformList[endingIndex] - uniformList[beginningIndex];
		
		int elementsPerSingle = elements / range;
		int elementsPerUnit  = elementsPerSingle *howManyUnits;
		System.out.println(" This is the element" + elementsPerUnit ) ;

		// using the hash table with the single elements
		Set<String> singleElementHashing = new HashSet<>();
		
		Map<String, Integer> doubleValue = new HashMap<>(); 
		
		
		String studyFile = "people also have their ideas of how to live";
			
			// PrintWriter documentWriter = new PrintWriter(file);
			// System.out.println(readingFile);
				// if (readingFile.hasNext()){
				System.out.println("there was next ");
				// System.out.println(readingFile.next());
				// documentWriter.println(" I would like to move throughout the day");
				// documentWriter.close();
				
		}
	
	
		
		// while (beginningIndex < endingIndex ) {
			// int middleIndex = ( (beginningIndex + endingIndex) / 2) ;
			// Get the middle
			// int choice = binaryList[middleIndex]; 
			// if (data < choice){
				// endingIndex = middleIndex;
			// } else if(data > choice ) {
				// beginningIndex = middleIndex;
			// } else if(data == choice ){
				// firstFind = middleIndex;
			// }
		// }
		
		// System.out.println(" Here is our attempt to find: " + uniformList[elementsPerUnits] ) ;
		// System.out.println("" )
		// for(int i = 0 : uniformList.length : i ++){  
			// exampleList =
		// }	
		
		// Arrays.fill(myArray, 16);

		int equationResult = 2 + 2;
		System.out.println("HELLO");
		// System.out.println(myArray);

		System.out.println(equationResult);  
	}
}
// Hello
// helloworldhello_world
// < Intr = < int = > <= >= sese Martella Morteza
	// u = less call
	// = less call
// < = < = > < >
// hello, %, &&, *, *=, +, ++, +=,
// -, --, -=, /=, :, ;
// ||, ?, >=, >, ==, =, <=, <, ;