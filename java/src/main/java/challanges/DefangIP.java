package challanges;

public class DefangIP {

    public String defangIPaddr(String address) {

       StringBuilder defanged = new StringBuilder();

       char[] addressArray = address.toCharArray();

       for(int i = 0; i < addressArray.length; i++){

           if(addressArray[i] == '.'){

               defanged.append('[');
               defanged.append(addressArray[i]);
               defanged.append(']');
               continue;
           }

           defanged.append(addressArray[i]);

       }

        return defanged.toString();

    }
}
