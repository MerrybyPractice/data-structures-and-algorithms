package challanges;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){

//        nested for loop?

        for (int a = 0; a < nums.length; a++){
            for (int b = 0; b < nums.length; b++){

                if (nums[a] + nums[b] == target){

                    int result[] = new int[2];
                    result[0] = a;
                    result[1] = b;

                    if (result[0] == result[1]){
                        int pending[] = result;
                        continue;
                    } else {
                        return result;
                    }

                } else {
                    continue;
                }
            }
        }
    return null;

    }
}
