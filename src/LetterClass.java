/**
 * Created by jonat on 6/19/2016.
 */

/**Class to implement the Singleton design pattern
    Scrabble has only a single set of letters which has to be used by all the players
  */
public class LetterClass {

    private static LetterClass firstInstance=null; //will be instantiated later

    private String[] letterSet={"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    //make the constructor private so that no other instance of the class can be created
    private LetterClass()
    {
        //can give the option to the user to enter his own set of all the letters
    }

    //function to return the only instance of the LetterClass
    public static LetterClass getInstance()
    {
        //this method does not support multiple threads at the moment
        if(firstInstance==null)
        {
            firstInstance=new LetterClass();
        }

        //if the firstInstance was null then instantiation takes place else the first instance is returned
        return firstInstance;
    }


}
