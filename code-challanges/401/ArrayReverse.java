public class ArrayReverse{
  public static void main(String[] args){
   int[] input = {1, 2, 3, 4, 5}; 
   System.out.println(arrayReverse(input));

   int[] empty; 
   System.out.println(arrayRevers(empty));

   int[] duple = {1, 7, 7, 4, 3, 3, 6, 6};
   System.out.println(arrayReverse(duple));
   
    int[] pallindrome = {1,2,3,2,1};
    System.out.println(arrayReverse(pallindrome));

  }
    public static int[] arrayReverse (int[] input){
    int[] output = new int [input.length]; 
    for(int i = (input.length - 1); i >= 0; i--){
      output[i] = input[(input.length - 1) - i];
    }
    return Arrays.toString(output);
  }
}