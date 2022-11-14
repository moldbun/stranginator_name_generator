import java.util.ArrayList;
import java.util.Random;

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
  }

  public void getName() { //Accessor
    System.out.println(userName);
  }

  public void createFirstName() {
    Random randGen = new Random();
    ArrayList<String> fNameP1 = new ArrayList<String>();
    fNameP1.add("acious");
    fNameP1.add("cious");
    fNameP1.add("bol");
    fNameP1.add("queebli");
    fNameP1.add("infi");
    fNameP1.add("icious");
    fNameP1.add("indleton");
    
    ArrayList<String> fNameP2 = new ArrayList<String>();
    fNameP2.add("ton");
    fNameP2.add("bolbon");
    fNameP2.add("bin");
    fNameP2.add("ron");
    fNameP2.add("bon");
    
    ArrayList<String> lNameP1 = new ArrayList<String>();
    lNameP1.add("Mc");
    lNameP1.add("Trunk");
    lNameP1.add("Crack");
    lNameP1.add("Bum");
    lNameP1.add("Pickle");
    lNameP1.add("Apple");
    lNameP1.add("Stinkle");
    
    ArrayList<String> lNameP2 = new ArrayList<String>();
    lNameP2.add("fart");
    lNameP2.add("bum");
    lNameP2.add("shart");
    lNameP2.add("dunk");
    lNameP2.add("clam");
    lNameP2.add("back");
    
    ArrayList<String> titles = new ArrayList<String>();
    titles.add("Wise");
    titles.add("Old");
    titles.add("Smelly");
    titles.add("Wide");
    titles.add("Lard");

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

  public void createMiddleName() {

  }
}

