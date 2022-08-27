package 数组;

import java.util.Scanner;

public class 删除排序数组中的重复项 {
    public static int removeDuplicates(int[] nums) {

        if(nums==null||nums.length==0){
            return 0;
        }
        int b[] =new int[nums.length];
        int k=1;int index=1;
        b[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                b[index]=nums[i];
                k++;
                index++;
            }
        }
        for(int i=0;i<b.length;i++){
            nums[i]=b[i];
        }
            return k;

//                int slow=1;
//        int fast;
//        for(fast=1;fast<nums.length;fast++){
//            if(nums[fast]!=nums[fast-1]){
//                nums[slow]=nums[fast];
//                slow++;
//            }
//        }
//      return slow;
    }
    public static void main(String[] args) {

        int nums[]={1,2,2,3,3,3,4,5,6};

        int k=removeDuplicates(nums);
    }
}
