package Seminars_Exceptions.HomeWork.HomeWork2;

public class task2 {
    public static void main(String[] args) {
        
    }

    public static void getException(int[] intArray) {
        try
        {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException i) {
            System.out.println("Cathcing exception: " + i);
        }

    }

}
