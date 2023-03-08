import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] nums = {1.1, 2.2, -3.3, 4.4, -5.5, 6.6,-7.7, 8.8,-9.9,10.1,-11.2,12.3,-13.4,14.5 -15.6};

        int countOfPositiveNumbers = 0;
        double sumOfPositiveNumbers = 0;
        boolean flag = false;

        for (double positiveNumber: nums) {
            if (positiveNumber > 0 && flag == false) {
                continue;
            }

            if (positiveNumber < 0) {
                flag = true;
                continue;
            }

            countOfPositiveNumbers ++;
            sumOfPositiveNumbers += positiveNumber;
        }

        System.out.println(sumOfPositiveNumbers / countOfPositiveNumbers);
    }
}