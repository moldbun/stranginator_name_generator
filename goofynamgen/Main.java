import java.io.IOException;
import java.util.Scanner;

public class Main {
	
  public static void main (String[] args) throws IOException {
    Scanner scnr = new Scanner(System.in);
    Generator uInput = new Generator();

    String userInput;
    boolean progLoop = true;

    System.out.println("Welcome to the goofy-ahh name generator");
    System.out.println("****************");

    //Loop to make program keep running
    while(progLoop == true) {
      System.out.print("Please enter your name:");

      userInput = scnr.next();

      uInput.setName(userInput);
      uInput.createFirstName();
    }

    scnr.close();
  }
}