/**
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1

  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if (n == 0) return 0; // base case solution and boolean
        else if (n == 1) return 1; //recursive solution
        else return fib_recurrence(n-1) + fib_recurrence(n-2); //recursive abstraction, leftover and combination
    }
     /* These are class methods because you are not running operations on an instance of a class
    */


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        long sum = 1;
        long firstValue = 0;
        long secondValue = 1;
        int counter = 1;
        while (counter < n){
            sum = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = sum;
            counter++;
        }
        return sum;
    }
    /* Time complexity:
       Consider the size of the problem to be ...

       As the proxy for the time required, count...

       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because each element adds a constant amount to the cost
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = (1 + Math.sqrt(5))/2;
        double psi = (1 - Math.sqrt(5))/2;
        double output = (Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5);
        return output; // invalid Fibonacci number
    }
    /* Time complexity:
       Consider the size of the problem to be ...

       As the proxy for the time required, count...

       Then cost of the the recurrence algorithm
       stays the same
       as the size of the problem increases,
       because the answer is reached by calculations.
     */
}
