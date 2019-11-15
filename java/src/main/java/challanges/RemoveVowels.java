package challanges;

import java.util.ArrayList;
import java.util.List;

public class RemoveVowels {

    public String removeVowels(String S) {

        ArrayList<Character> charArrayS = new ArrayList<Character>();

        for (char c : S.toCharArray()) {
            charArrayS.add(c);
        }

        List<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        while (charArrayS.containsAll(vowels)) {

            if (charArrayS.contains('a')) {

                charArrayS.remove('a');
            }

            if (charArrayS.contains('e')) {

                charArrayS.remove('e');
            }

            if (charArrayS.contains('i')) {

                charArrayS.remove('i');

            }

            if (charArrayS.contains('o')) {

                charArrayS.remove('o');

            }
        }

        String returnValue = charArrayS.toString();

        return returnValue;

    }

}


