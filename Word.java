//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jacob Lujan

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?
   
   //add an instance variable
   private String word;
	//create a constructor
	public Word()
  {
    word = "";
  }
  public Word(String W)
  {
    word = W;
  }

	//create other methods

  public void setWord(String wordy)
  {
    word = wordy;
  }

  public int getNumVowels()
  {
    int numVowels = 0;
    for(int i = 0; i < word.length(); i++)
    {
      if(vowels.indexOf(word.charAt(i))>= 0)
      numVowels++;
    }

    return numVowels;
  } 
  public int getLength()
  {
    return word.length();
  }
	//look at the sample runner code
	//on the lab handout

	//create a toString method
  public String toString()
  {
    return "" + word;
  }
}