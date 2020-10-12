import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/
 * 
 * Write an algorithm to determine if a number n is "happy". A happy number is a
 * number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the
 * process until the number equals 1 (where it will stay), or it loops endlessly
 * in a cycle which does not include 1. Those numbers for which this process
 * ends in 1 are happy numbers. Return True if n is a happy number, and False if
 * not
 * 
 * Input: 19 Output: true Explanation: 12 + 92 = 82 82 + 22 = 68 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */

public class HappyNumber202 {
    public static void main(String[] args) {
        HappyNumber202 main = new HappyNumber202();
        System.out.println(main.isHappy(19));
    }
    
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        int squareSum,remain;
        while (seen.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n % 10;
                squareSum += remain*remain;
                n /= 10;
            }
            if (squareSum == 1) {
                return true;
            } else {
                n = squareSum;
            }
        }
        return false;
    }
}
