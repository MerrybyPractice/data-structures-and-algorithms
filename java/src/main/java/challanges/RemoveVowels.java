package challanges;

import java.util.ArrayList;

public class RemoveVowels {

    public String removeVowels(String S) {

        ArrayList<Character> charArrayS = new ArrayList<Character>();
        for (char c : S.toCharArray()) {
            charArrayS.add(c);
        }


        if (charArrayS.contains('a')) {

            charArrayS.remove('a');
        }

        if (charArrayS.contains('e')){

            charArrayS.remove('e'); 
        }
    }

}


