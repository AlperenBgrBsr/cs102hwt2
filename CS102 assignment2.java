import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class menu 
{
    public static int[] array;
    public static void main(String[] args)
    {
        int userChoice;
        int arraySize;
        boolean isValid = false;
        Scanner sc = new Scanner(System.in);

        
        while ( !isValid )
        { 
            System.out.print("Enter the size of the array: ");

            if(sc.hasNextInt())
            {
                arraySize = sc.nextInt();

                
                if(arraySize > 0)
                {
                    array = createArray(arraySize);
                    System.out.println("Array created! "); 
                    isValid = true;

                }
                else {
                    System.out.println("Enter an integer greater than 0 ");
                    System.out.print("Enter the size of the array: ");
                    int input = sc.nextInt();
                    isValid = input > 0;

                }
            }
            else
            {
                System.out.println("Enter an integer!");
                sc.nextLine();
            }
        }

        do
        {
            System.out.println();
            System.out.println("1. Find the array's max");
            System.out.println("2. Find the array's min");
            System.out.println("3. Find the average of the array");
            System.out.println("4. Find the sum of odd indexed elements");
            System.out.println("5. Find the sum of even indexed elements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            userChoice = sc.nextInt();

            switch(userChoice)
            {
    
                case 1:
                    System.out.println("Max value of the array is: "+max(array));
                    break;
                
                case 2:
                    System.out.println("Min value of the array is: "+min(array));
                    break;
                case 3:
                    System.out.println("Average of the array is "+average(array));
                    System.out.println(Arrays.toString(standartDeviation(array)));
                    break;
                case 4:
                    System.out.println("Sum of odd indexed elements: "+findOddIndexSum(array));
                    break;
                case 5:
                    System.out.println("Sum of even indexed elements: "+findEvenIndexSum(array));
                    break;
                case 6:
                    System.out.println("Exiting program........");
                    return;
                default: 
                    System.out.println("Enter valid choice!!");
                    System.out.println();
            }
        }while(userChoice != 6);
    }


    

    public static int[] createArray(int n)
    {
        Random random = new Random();
        int[] array = new int[n];
        for (int i=0; i<array.length; i++)
        {
            array[i] = random.nextInt(0,101);
        }
        return array;
    }
    public static double average(int[] numbers)
    {
        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        if(numbers.length == 0){
            System.out.println("Division by zero is not possible!!");
            return 0;
        }
        return sum / numbers.length;
    }
    public static double[] standartDeviation(int[] numbers)
    {
        double[] deviation = new double [numbers.length];
        double average = average(numbers);
        for(int i = 0; i < numbers.length; i++){
            deviation[i] = numbers[i] - average;
        }
        return deviation;
    }

    public static int findEvenIndexSum(int[] array){ 

        int sum = 0; 
        for ( int i = 0; i < array.length; i = i+2){
            sum += array[i];
        }

        return sum;

    }

    public static int findOddIndexSum(int[] array){ 

        int sum = 0; 
        for ( int i = 1; i < array.length; i = i+2){
            sum += array[i];
        }

        return sum;

    }

    public static int min (int[] numbers)
    {
        int minNum = 100;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] < minNum)
            {
                minNum = numbers[i];
            }
        }

        return minNum;
    }

    public static int max (int[] numbers)
    {
        int maxNum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > maxNum)
            {
                maxNum = numbers[i];
            }
        }

        return maxNum;
    }
}

