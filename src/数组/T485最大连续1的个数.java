package 数组;

public class T485最大连续1的个数 {
    public static int Max(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int count = 0;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else {
                result=Math.max(result,count);
                count=0;
            }
        }

        return Math.max(result,count);
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else {
                if(count>=result){
                    result=count;
                }
                count=0;
            }
        }
        if(count>result){
            result=count;
        }
        return result;

    }
    public static void main(String[] args) {
        int[] array=new int[]{1,1,0,1,1,1};
        System.out.println(Max(array));
    }

}
