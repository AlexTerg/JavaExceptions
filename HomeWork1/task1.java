package Seminars_Exceptions.HomeWork.HomeWork1;

/*
 Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения;
 */

public class task1 {
    public static void main(String[] args) {
        System.out.println(getNullPointerException());
        System.out.println(getIndexOutException());
        System.out.println(divByZero());
        
    }

    public static int divByZero() {
        return 1 / 0;
    }

    public static int[] getIndexOutException() {
        int[] array = new int[10];
        for (int i = 0; i < array.length + 1; i++) {
            array[i] += 1;
        }
        return array;
    }

    public static int getNullPointerException() {
        Integer[] array = new Integer[]{null};
        return array[0];
    }
}
