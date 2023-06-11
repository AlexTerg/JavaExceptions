package Seminars_Exceptions.HomeWork.HomeWork1;

import java.util.Arrays;

/*
 Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 и возвращает новый массив, каждый элемент которого равен разности элементов двух 
 входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

 */
public class task3 {
    public static void main(String[] args) {
        int[] array1 = new int[]{6, 6, 6, 6, 1};
        int[] array2 = new int[]{6, 6, 6, 6};
        int[] arr = getDiffArrays(array1, array2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getDiffArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            throw new IndexOutOfBoundsException("Разная длинна массивов");
        }
        int[] diffArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            diffArray[i] = firstArray[i] - secondArray[i];
        }
        return diffArray;
    }
}
