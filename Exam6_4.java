/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam6;

/**
 *
 * @author 하이테크
 */
public class Exam6_4 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int max = getMaxValue(nums);
        System.out.println("max : " + max);

        int min = getMinValue(nums);
        System.out.println("min : " + min);
    }

    public static int getMaxValue(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    public static int getMinValue(int[] nums) {
        int min = nums[0];
              for (int i = 0; i < nums.length - 1; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
}
