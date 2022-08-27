package 数组.知识点;

import org.junit.Test;

import java.sql.Connection;
import java.util.*;

public class 常用操作 {
    @Test
    public void 创建数组() {
        int[] a = {1, 2, 3};
        System.out.println("a:" + Arrays.toString(a));
        int[] b = new int[]{1, 2, 3};
        System.out.println("b:" + Arrays.toString(b));
        int[] c = new int[3];
        for (int i = 0; i < c.length; i++) {
            c[i] = i + 1;
        }
        System.out.println("c:" + Arrays.toString(c));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(i + 1);
        }
        System.out.println("arr:" + arr.toString());

    }

    @Test
    public void 添加元素() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(i + 1);
        }
        System.out.println("arr:" + arr.toString());
        arr.add(99);  //在末尾添加元素  时间复杂度为O(1)
        arr.add(99);//在索引为3 的位置添加元素，时间复杂度为O(N)
    }

    @Test
    public void 访问元素() {
        int[] a = {1, 2, 3};
        System.out.println("a:" + Arrays.toString(a));
        int a1 = a[1];  //访问普通数组元素  a[index]
        System.out.println(a1);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(i + 1);
        }
        int arr1 = arr.get(1);  //访问列表元素  .get(Index)
        System.out.println(arr1);

    }

    @Test
    public void 更新元素() {
        int[] a = {1, 2, 3};
        System.out.println("a:" + Arrays.toString(a));
        a[1] = 99;    //更新普通数组 a[index]=num;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(i + 1);
        }
        arr.set(1, 11);  //更新列表元素  .set(Index)

    }

    @Test
    public void 删除元素() {//O(N)
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(i + 1);
        }
        arr.remove(2);
    }

    @Test
    public void 数组长度() {
        int[] a = {1, 2, 3};
        System.out.println("a:" + Arrays.toString(a));
        a[1] = 99;    //更新普通数组 a[index]=num;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(i + 1);
        }
        int a1 = arr.size();//O(1)
        int a2 = a.length;//O(1)
    }

    @Test
    public void 遍历数组() {//O(N)
        int[] a = {1, 2, 3};
        System.out.println("a:" + Arrays.toString(a));
        a[1] = 99;    //更新普通数组 a[index]=num;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(i + 1);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));

        }
    }
    @Test
    public void 查找数组(){//O(N)
        int[] a = {1, 2, 3};
        System.out.println("a:" + Arrays.toString(a));
        a[1] = 99;    //更新普通数组 a[index]=num;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(i + 1);
        }

        for(int i=0;i<a.length;i++){
            if(a[i]==2){
                System.out.println(i);
            }
        }
        boolean isContain=arr.contains(2);
        System.out.println(isContain);
    }
    @Test
    public void 数组排序(){//O(NlogN)
        int[] c=new int[]{1,2,3};
        System.out.println(Arrays.toString(c));
        ArrayList<Integer> arr=new ArrayList();
        arr.add(2);
        arr.add(3);
        arr.add(1);
        System.out.println(arr.toString());
        //从小到大
        Arrays.sort(c);//1,2,3
        Collections.sort(arr);//1,2,3
//        从大到小
//        ①将数组c 从后往前读出；
//        ②将int[] c ==>Integer[] c
//        将其转化成包装类型，就可以使用
//        Arrays.sort(T[],Collections.reverseOrder());
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);//1,2,3

    }
}
