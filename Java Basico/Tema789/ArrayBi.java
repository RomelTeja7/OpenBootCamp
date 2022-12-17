package JavaBasicTheme.theme789;

import java.util.Arrays;

public class ArrayBi {

    public static void main(String[] args) {

        int[][] nums = {{1, 2, 3, 4},{5, 6, 7, 8}};

        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums[j].length; i++) {
                System.out.print("["+i +"]");
                System.out.print(nums[j][i]+"  ");
            }
            System.out.println("");
        }

    }
}
