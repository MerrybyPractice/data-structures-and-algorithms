package challanges;

import static java.util.Arrays.copyOfRange;


public class ReverseIntiger {

        public int reverse (int x) {

            int returnValue;

            Integer integerX = (Integer) x;

            String stringX = integerX.toString();

            char[] charX = stringX.toCharArray();

            char negative = 0;

            int length = charX.length;

            char[] charXTwo = charX;

            if (charX[0] == '-'){

                negative = charX[0];

                charXTwo = copyOfRange(charX, 1, length);
            }

            char[] reversed;
            reversed = new char[charXTwo.length];

            for (int i = charXTwo.length; i >= 0; i--){

                if (negative == '-'){

                    reversed[0] = '-';
                    reversed[i+1] = charXTwo[i];
                } else {

                    reversed[i] = charXTwo[i];
                }
            }

            String reversedString = reversed.toString();


            try{
                returnValue = Integer.parseInt(reversedString, 10);
            }
            catch (NumberFormatException e){

                returnValue = 0;

            }

            return returnValue;
        }
    }

