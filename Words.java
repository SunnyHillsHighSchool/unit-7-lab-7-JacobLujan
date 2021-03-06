//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jacob Lujan

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList) 
	{
    words = new ArrayList<Word>();
    for(int j = 0; j < wordList.length; j++)
    {
      words.add(new Word(wordList[j]));
    }
	}

	public int countWordsWithXChars(int size)
	{
		int count=0;
    for (int j = 0; j < words.size(); j++)
    {
      Word word2 = words.get(j);
      if(word2.getLength() == size)
      {
        count++;
      }
    }
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int count=0;

    for(int j = words.size()-1; j >= 0; j--)
    {
      if(words.get(j).getLength() == size)
      {
        count = count + words.get(j).getNumVowels();
        words.remove(j);
      }
    }
    return count;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
		
    for(int j = 0; j < words.size(); j++)
    {
      if(words.get(j).getNumVowels() == numVowels)
      {
        count++;
      } 
    }
    return count;
	}
	
	//add in a toString
  public String toString()
  {
    return "" + words;
  }
}