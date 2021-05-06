import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

class ReadAndWriteTest {

	public static void main(String args[]) throws FileNotFoundException {

		Random myRandom = new Random();
		PrintStream diskWriter = new PrintStream("test.txt");
		Scanner diskScanner = new Scanner(new File("test.txt"));
		
		try {
			int i = 0;
			for (i = 1; i <= 10; i++) {

				int randomNumber = myRandom.nextInt(100) + 1;
				diskWriter.print(randomNumber + " ");
			}

			int[] myArray = new int[i - 1];

			for (i = 1; i <= 10; i++) {

				myArray[i-1] = diskScanner.nextInt();
			}
			for (int element : myArray) {

				System.out.print(element + " ");
			}
		} finally {
			diskScanner.close();
			diskWriter.close();
		}
	}
}

