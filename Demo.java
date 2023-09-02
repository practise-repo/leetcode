import java.util.Arrays;

public class Demo {
    

    public static void main(String[] args) {

        int[] nums={2, 7, 11, 15,2,7};
        int target=9;
        
        int[] answer=twoSum(nums,target);
        // System.out.println("Output: "+Arrays.toString(answer));
   
    }

    public static int[] twoSum(int[] nums, int target) {
        System.out.printf("Input: %s ,target=%s\n", Arrays.toString(nums),target);
        int[] output=new int[2];
        mainloop:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j) {
                    if (nums[i] + nums[j] == target && i != j) {
                        output[0]=i;
                        output[1]=j;
                        System.out.println("Output: "+Arrays.toString(output));
                        break mainloop;
                    }

                } else
                    continue;

            }
        }
        return output;

    }
}