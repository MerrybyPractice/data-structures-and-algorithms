package challanges;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toUnsignedLong;



public class ReverseIntiger {

        public int reverse (int x) {

            boolean isNegative = false;

            if (x < 0){
                isNegative = true;
                x *= -1;
            }

            String stringyX = String.valueOf(x);

            stringyX = reverseString(stringyX);

            Integer returnValue = parseInt(stringyX);

            if(isNegative == true){
                returnValue *= -1;
            }


            return returnValue;
        }

        public String reverseString(String stringyX){

            StringBuilder build = new StringBuilder(stringyX);

            return build.reverse().toString();

        }
    }

