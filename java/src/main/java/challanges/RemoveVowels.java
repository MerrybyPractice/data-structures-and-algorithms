package challanges;

import java.util.ArrayList;
import java.util.List;

public class RemoveVowels {

    public String removeVowels(String S) {

        char[] charArrayS = S.toCharArray();

        StringBuilder rebuildS = new StringBuilder(S.length());

       for (int i = 0; i < S.length(); i++) {

            if (charArrayS[i] != 'a' && charArrayS[i] != 'e' && charArrayS[i] != 'i' && charArrayS[i] != 'o' && charArrayS[i] != 'u') {

                rebuildS.append(charArrayS[i]);

            }

        }

        return rebuildS.toString();

    }

}


