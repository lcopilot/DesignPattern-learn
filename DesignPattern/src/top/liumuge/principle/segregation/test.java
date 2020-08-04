package top.liumuge.principle.segregation;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/6/17
 * @time: 12:09
 * @description:
 */
public class test {

    ArrayList<Object> objects = new ArrayList<>();

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3,5}, {4, 5, 6}, {7, 8, 9,10},{48,85,95}};
        int[] num = new int[array.length];
        test test = new test();
        test.sort(array,array.length, 0, num);
        System.out.println(test.objects);
    }


    public  void sort(int[][] array, int length, int index, int[] num) {
        if (index == length ) {
            objects.add(Arrays.toString(num));
            return;
        }

        for (int j = 0; j < array[index].length; j++) {//数组中的每一位遍历一次
            num[index] = array[index][j];
            sort(array,length, index+1,num);
        }
    }
}
