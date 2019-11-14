package challanges;

public class ReverseIntiger {

        public int reverse (int x) {

            boolean isNegative = false;

            if (x < 0){
                isNegative = true;
                x *= -1;
            }

            String stringyX = String.valueOf(x);

            stringyX = reverseString(stringyX);

            Integer returnValue;

            try{
                returnValue = Integer.parseInt(stringyX);
            } catch (NumberFormatException e){
                System.out.println(stringyX);
                System.out.println(e);
                returnValue = 0;
            }


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

