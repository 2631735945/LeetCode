package 数组;

public class T1两数之和 {
    public int[] twoSum(int[] nums, int target) {

//        int[] result=new int[2];
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums.length;j++){
//                if(nums[i]+nums[j]==target && i!=j){
//                    result[0]=i;
//                    result[j]=j;
//                    return result;
//                }
//            }
//        }
//        return result;
    int[] num=new int[2];
    for(int i=0;i<nums.length;i++){
        for (int j=0;j<nums.length;j++){
            if(nums[i]+nums[j]==target && i!=j){
                num[0]=nums[i];
                num[1]=nums[j];
                return num;
            }

        }
    }
        return num;




    }

}
