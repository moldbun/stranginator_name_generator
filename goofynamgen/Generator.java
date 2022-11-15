import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Generator {
  private String userName;

  public void setName(String userNameInput) { //Mutator
    int nameLength = userNameInput.length();
    if(nameLength > 3) {
      userName = userNameInput.substring(0, nameLength -1);
    }
    else {
      userName = userNameInput;
    }
    
    int finalNameIndex = userName.length() - 1;
    System.out.println(userName.charAt(finalNameIndex));
  }
  
  public void getName() { //Accessor
    System.out.println(userName);
  }

  public void createFirstName() throws IOException {
	FileInputStream fileByteStream = null;
	Scanner inFS = null;
    Random randGen = new Random();
    
    ArrayList<String> fNameP1 = new ArrayList<String>();
    ArrayList<String> fNameP2 = new ArrayList<String>();
    ArrayList<String> lNameP1 = new ArrayList<String>();
    ArrayList<String> lNameP2 = new ArrayList<String>();
    ArrayList<String> titles = new ArrayList<String>();

    //Open file fNameP1.txt
    fileByteStream = new FileInputStream("fNameP1.txt");
    inFS = new Scanner(fileByteStream);
    //Add names to arrayList.
    do {
    	String inputName = inFS.nextLine();
    	fNameP1.add(inputName);
    } while(inFS.hasNextLine());
    
    fileByteStream.close(); 
    inFS.close();
    
    //Open file fNameP2.txt
    fileByteStream = new FileInputStream("fNameP2.txt");
    inFS = new Scanner(fileByteStream);
    //Add names to arrayList.
    do {
    	String inputName = inFS.nextLine();
    	fNameP2.add(inputName);
    } while(inFS.hasNextLine());
    
    fileByteStream.close(); 
    inFS.close();
    
    //Open file lNameP1.txt
    fileByteStream = new FileInputStream("lNameP1.txt");
    inFS = new Scanner(fileByteStream);
    //Add names to arrayList.
    do {
    	String inputName = inFS.nextLine();
    	lNameP1.add(inputName);
    } while(inFS.hasNextLine());
    
    fileByteStream.close(); 
    inFS.close();
    
    //Open file lNameP2.txt
    fileByteStream = new FileInputStream("lNameP2.txt");
    inFS = new Scanner(fileByteStream);
    //Add names to arrayList.
    do {
    	String inputName = inFS.nextLine();
    	lNameP2.add(inputName);
    } while(inFS.hasNextLine());
    
    fileByteStream.close(); 
    inFS.close();
    
    //Open file titles.txt
    fileByteStream = new FileInputStream("titles.txt");
    inFS = new Scanner(fileByteStream);
    //Add names to arrayList.
    do {
    	String inputName = inFS.nextLine();
    	titles.add(inputName);
    } while(inFS.hasNextLine());
 
    fileByteStream.close(); 
    inFS.close();
    
    String newFirstName = userName;
    String lastName = "";

    int randArrayNumFNP1 = randGen.nextInt(fNameP1.size()) + 0;
    newFirstName = newFirstName + fNameP1.get(randArrayNumFNP1);
    
    int randArrayNumFNP2 = randGen.nextInt(fNameP2.size()) + 0;
    newFirstName = newFirstName + fNameP2.get(randArrayNumFNP2);
    
    int randArrayNumLNP1 = randGen.nextInt(lNameP1.size()) + 0;
    lastName = lastName + lNameP1.get(randArrayNumLNP1);
    
    int randArrayNumLNP2 = randGen.nextInt(lNameP2.size()) + 0;
    lastName = lastName + lNameP2.get(randArrayNumLNP2);
    
    int titleChance = randGen.nextInt(100) + 0;
    if(titleChance < 50) {
    	String title = " ";
    	
        int randArrayNumTitles = randGen.nextInt(titles.size()) + 0;
        title = title + titles.get(randArrayNumTitles);
        
    	System.out.println(newFirstName + " " + lastName + " The" + title);	
    }
    else {
    	System.out.println(newFirstName + " " + lastName);	
    }
  }
}

