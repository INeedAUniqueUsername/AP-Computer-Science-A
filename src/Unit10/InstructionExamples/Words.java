package Unit10.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		words = new ArrayList<Word>();
		for(String s : wordList.split(" ")) {
			words.add(new Word(s));
		}
	}
	
	public int countWordsWithXChars(int size)
	{
		int result = 0;
		for(Word s : words) {
			if(s.getLength() == size) {
				result++;
			}
		}
		return result;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowels = 0;
		int i = 0;
		while(i < words.size()) {
			Word w = words.get(i);
			if(w.getLength() == size) {
				vowels += w.getNumVowels();
				words.remove(i);
			} else {
				i++;
			}
		}
		return vowels;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int result = 0;
		for(Word w : words) {
			if(w.getNumVowels() == numVowels) {
				result++;
			}
		}
		return result;
	}
	
	public String toString()
	{
	   return words.toString();
	}
}