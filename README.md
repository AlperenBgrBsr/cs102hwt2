import java.util.Random;
public class ArrayOperations{
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
    public static int findMax(int[] array)
    {
        int maxElement = 0;
        for (int element : array)
        {
            if (element > maxElement)
            {
                maxElement = element;
            }
        }
        return maxElement;
    }
    public static int findMin(int[] array)
    {
        int minElement = 100;
        for (int element : array)
        {
            if (element < minElement)
            {
                minElement = element;
            }
        }
        return minElement;
    }
    public static int[] findAverageDifference(int[] array)
    {
        int sum = 0;
        int average = 0;
        int[] newArray = new int[array.length];
        for (int element : array)
        {
            sum += element;
        }
        average = sum / array.length;
        for (int i = 0; i<array.length; i++)
        {
            newArray[i] = array[i] - average;
        }
        return newArray;
    }
    public static int findOddSum(int[] array)
    {
        int sum = 0;
        for (int i = 1; i<array.length; i=i+2)
        {
            sum += array[i];
        }
        return sum;
    }
    public static int findEvenSum(int[] array)
    {
        int sum = 0;
        for (int i = 0; i<array.length; i=i+2)
        {
            sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
