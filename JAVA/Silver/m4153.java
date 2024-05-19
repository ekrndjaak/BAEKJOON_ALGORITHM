package JAVA.Silver;


import java.util.Scanner;
import java.util.Arrays;

public class m4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] order = new int[8];

        for (int i = 0; i < 8; i++) {
            order[i] = scanner.nextInt();
        }

        System.out.println(classifyMusic(order));
    }

    public static String classifyMusic(int[] order) {
        int[] ascending = order.clone();
        int[] descending = order.clone();

        Arrays.sort(ascending);
        Arrays.sort(descending);

        // descending 순서로 변경
        reverseArray(descending);

        if (Arrays.equals(order, ascending)) {
            return "ascending";
        } else if (Arrays.equals(order, descending)) {
            return "descending";
        } else {
            return "mixed";
        }
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

