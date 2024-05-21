package homework;
//решение через 1 поток

public class SolutionViaOneThread {

    /**
     * method for subtracting quantities of number by condition
     *
     * @param minValue minimum value
     * @param maxValue maximum value
     * @return number of numbers that satisfy the condition
     */

    public static int findNumberRequierement(int minValue, int maxValue) {
        int count = 0;
        for (int i = minValue; i <= maxValue; i++) {
            if (i % 21 == 0 && Integer.toString(i).contains("3")) {
                count++;
            }
        }
        return count;
    }

    ;


    public static void main(String[] args) {

        int numberOfNumber = findNumberRequierement(0, 2_000_000_000);
        System.out.println("quantities of number by condition: " + numberOfNumber);

    }
}
