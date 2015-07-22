// @Freddie Pike
// A program that prints the perimeter of a letter sized sheet of paper and
// prints it's diagonal

public class Perimeter {
	public static void main (String[] args) {
		
// Create 2 variables that will be used to get the perimeter
		double width = 8.5 * 2;
		double length = 11 * 2;
		double perimeter = length + width;
		
// Create 2 variables that will be used to get the length of 
// the diagonal
		double diagonalLengthValues = 8.5 * 8.5 + 11 * 11;
		double lengthOfDiagonal = Math.sqrt(diagonalLengthValues);
		
// Print the perimeter and length of the diagonal results
		System.out.println("The perimeter of a letter sized sheet of paper is " + perimeter);
		System.out.println("The length of a letter sized sheet of paper's diagonal is " + lengthOfDiagonal);
	
	}
}
