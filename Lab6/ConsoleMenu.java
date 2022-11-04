package Lab6;

import java.util.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

class Word
{
	private String name;
	 public Word() {}
	    public Word(String name) {
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "Word{" + name + "}";
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Word word = (Word) o;
	        return Objects.equals(name, word.name);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name);
	    }
}
class Definition
{
	private String description;

    public Definition() {}
    public Definition(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Definition{" + description + "}";
}
}

class Dictionary {
    HashMap<Word, Definition> dictionary = new HashMap<>();

    public void addWord(Word w, Definition d) {
        dictionary.put(w, d);
    }

    public Definition getDefinition(Word w) {
        return dictionary.get(w);
    }

    public void getAllWords() {
        System.out.println("Words: ");
        for(Word w : dictionary.keySet()) {
            System.out.println(w);
        }
    }

    public void getAllDefinitions() {
        System.out.println("Definitions: ");
        for(Definition d : dictionary.values()) {
            System.out.println(d);
        }
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "dictionary=" + dictionary +
                '}';
    }
}

public class ConsoleMenu {

	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
    Dictionary dictionary = new Dictionary();
    
   while(true)
   {
	   System.out.println();
       System.out.println("Dictionary");
       System.out.println("1.Add a new word to the dictionary");
       System.out.println("2.Get definition");
       System.out.println("3.Get all the words");
       System.out.println("4.Get all the definitions");
       System.out.println("0.Exit");
       
       int option=scanner.nextInt();
       switch(option)
       {
       case 1: System.out.println("Specify the word and the definition: ");
       String str = scanner.next();
       Word w = new Word(str);
       str = scanner.nextLine();
       Definition d = new Definition(str);
       dictionary.addWord(w, d);
       break;
       case 2:
    	   System.out.println("Specify the word");
    	   str=scanner.next();
    	   Word word = new Word(str);
           System.out.println(dictionary.getDefinition(word));
       case 3:
           dictionary.getAllWords();
           break;
       case 4:
           dictionary.getAllDefinitions();
           break;
       case 0:
           return;
       default:
           System.out.println("Incorrect input!");
           break;
       }
       
   }
	   
}
}
