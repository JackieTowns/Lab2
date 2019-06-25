import java.util.Scanner;

public class PerimeterArea {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		char userChar;
		userChar = 'y';

		while (userChar == 'y') {

			System.out.println("Enter the length of the room: ");
			double length = scnr.nextDouble();

			System.out.println();

			System.out.println("Enter the width of the room: ");
			double width = scnr.nextDouble();

			System.out.println();

			System.out.println("Enter the height of the room: ");
			double height = scnr.nextDouble();

			// A = lw
			// P=2(l+w)
			// Volume = Length * Height * Width, or V = L * H * W


			double area = length * width;
			double perimeter = 2 * (length + width);
			double volume = length * height * width;
		

			System.out.println("The area of the room is " + area);
			System.out.println("The area of the room is " + perimeter);
			System.out.println("The volume of the room is " + volume);
		
			System.out.println();



			System.out.println("Do you want to continue?");
			userChar = scnr.next().charAt(0);

		}
		
		System.out.println("Have a nice night!");
		scnr.close();

	}

}
