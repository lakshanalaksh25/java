public class ArraySum {
    public static void displaySum(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {          
            for (int j = 0; j < array[i].length; j++) {   
                sum += array[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }

    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        displaySum(numbers);
    }
}

