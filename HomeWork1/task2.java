package Seminars_Exceptions.HomeWork.HomeWork1;

/**
 * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете
 * получить?
 */
public class task2 {
    public static void main(String[] args) {
        String[][] array = new String[][]{
            {"1", "2", "1", "2", "3"},
            {"2", "1","2", "1", "2"}
        };
        System.out.println(sum2d(array));
        // NumberFormatException 
        // ArrayIndexOutOfBoundsException

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

}