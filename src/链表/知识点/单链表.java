package 链表.知识点;

import java.util.LinkedList;

public class 单链表 {
    public static void main(String[] args) {
//        创建链表
        LinkedList<Integer> list=new LinkedList<>();
//        添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(2,99);
        System.out.println(list);

//        访问元素
       int a= list.get(2);
        System.out.println(a);
//        搜索元素
        int index=list.indexOf(99);
        System.out.println(index);

//        更新元素
        list.set(2,88);
        System.out.println(list.get(2));
//         删除元素
        list.remove(2);
        System.out.println(list);
//        长度
        int length=list.size();
        System.out.println(length);


    }
}
