package edu.gatech.oad.antlab.person;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	 	pname = "Caroline Doi";
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
        /*String newStr;
        Random rand = new Random(input.length());
        newStr = "";
        int randInt = rand.nextInt();
        int x = 0;
        while (x < input.length()) {
            if (!(newStr.indexOf(input.charAt(randInt)))) {
                randInt = rand.nextInt();
            } else {
                newStr = newStr + Character.toString(input.charAt(randInt));
                x++;
            }
        }
        return newStr;*/
        //String[] letters = input.split("");
		List<String> letters = Arrays.asList(input.split(""));
        Collections.shuffle(letters);
        String shuffled = "";
        for(String l: letters) {
        	shuffled += l;
		}
		return shuffled;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
