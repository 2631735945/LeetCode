package 数组;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;


public class T283移动零 {

    @Test
    public void moveZeroes() {
        int[] nums=new int[]{0,1,0,3,12};
        int[] news=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                news[index]=nums[i];
                index++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i=0;i<news.length;i++){
            nums[i]=news[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    @Test
    public void moveZeroes1() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
