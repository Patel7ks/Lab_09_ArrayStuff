import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Step 1
        int[] dataPoints = new int[100];


        // Step 2
        Random rnd = new Random();

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Step 3
        System.out.println("The random numbers are:");

        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }

        System.out.println();


        // Step 4
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++)
        {
            sum = sum + dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array is: " + sum);

        System.out.println("The average of the random array is: " + average);


        // Step 5
        Scanner pipe = new Scanner(System.in);

        int userValue = SafeInput.getRangedInt( pipe, "Enter a number to search for", 1, 100);


        // Step 6
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userValue)
            {
                count++;
            }
        }

        System.out.println("The value " + userValue + " was found " + count + " times in the array.");

        // Step 7
        int searchValue = SafeInput.getRangedInt(pipe,"Enter another number to search for", 1, 100);

        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == searchValue)
            {
                System.out.println("The value " + searchValue + " was found at array index " + i + ".");

                found = true;
                break;
            }
        }

        if (found == false)
        {
            System.out.println("The value " + searchValue + " was not found in the array.");
        }

        // Step 8
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the array is: " + min);

        System.out.println("The maximum value in the array is: " + max);


        // Step 9
        double[] doublePoints = new double[dataPoints.length];

        for (int i = 0; i < dataPoints.length; i++)
        {
            doublePoints[i] = dataPoints[i];
        }

        System.out.println("Average of dataPoints is: " + getAverage(doublePoints));

    }

    public static double getAverage(double values[])
    {
        double sum = 0;

        for (int i = 0; i < values.length; i++)
        {
            sum = sum + values[i];
        }

        return sum / values.length;
    }
}
