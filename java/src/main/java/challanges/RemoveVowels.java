package challanges;

import java.util.Hashtable;

public class RemoveVowels {
    /*In python I would check the string against a dict
    * and remove vowels based on that.
    * Java Hashtable will accomplish same thing:
    * 1. Create a Hashtable with vowels  */

    // would like to optimize this with a starting capacity of five but need to confirm syntax
    Hashtable<String, String> vowelHolder = new Hashtable<>();

    vowelHolder.put("a", "a");
    vowelHolder.put("e", "e");
    vowelHolder.put("i", "i");
    vowelHolder.put("o", "o");
    vowelHolder.put("u", "u");
}
