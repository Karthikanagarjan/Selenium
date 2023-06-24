
package week1.day1;

public class Fibbinocci  
{
    public static void main(String[] args) 
    {
        // 0 1 1 2 3 5 8 13 21 34 55 89 144
    	//variable declaration
        int firstNum = 0, secNum = 1, sum, n=13;
        // The number of terms in the Fibbinocci  series
        System.out.println("Fibonacci series:");
        System.out.println(firstNum);
        System.out.println(secNum);
        //1 2 3 5 8 13 21 34 55 89 144
        for (int i = 3; i <= n; i++) 
        {
            sum = firstNum + secNum;
            System.out.println(sum);
            firstNum = secNum;
            secNum = sum;
        }
    }
}
