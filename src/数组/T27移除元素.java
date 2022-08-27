package 数组;

public class T27移除元素 {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=0;
        for( right=0;right<nums.length;right++){
            if(nums[right]!=val){
                nums[left]=nums[right];
                left++;
            }
        }
        return left;

//int left=0;
//int right=0;
//for(right=1;right<nums.length;right++){
//    if(nums[right]!=val){
//        nums[left]=nums[right];
//        left++;
//    }
//}
//return left;

    }
}
