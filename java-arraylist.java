/**
Hackerrank: https://www.hackerrank.com/challenges/java-arraylist/problem


Input explanation
5 total of the lines
l1 -> 5 input 41 77 74 22 44
l2 -> 1 | 12
l3 -> 4 | 37 34 36 52
l4 -> 0
l5 -> 3 | 20 22 33
5 number of queries
1 3 pair number for query  x | y    
3 4
3 1
4 3
5 5

where x is the row and y the number position on the x row
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        final Scanner scanner = new Scanner(System.in);
        final List<int[]> data = new ArrayList<>();
        
        int n = scanner.nextInt();
        int index = 0;
        scanner.nextLine();
        
        while(index < n) {
            String[] arr = scanner.nextLine().split(" ");
            int length = Integer.parseInt(arr[0]);
            int[] numbers = new int[length];
            
            for(int j = 1; j <= length; j++) {
                numbers[j - 1] = Integer.parseInt(arr[j]);
            }
            data.add(numbers);
            index++;
        }
        
        n = scanner.nextInt();
        index = 0;
        scanner.nextLine();        
        
        while(index < n) {
            String[] query = scanner.nextLine().split(" ");

            try {
                int value = data.get(Integer.parseInt(query[0])-1)[Integer.parseInt(query[1])-1];
                System.out.println(value);
            } catch (Exception exception) {
                System.out.println("ERROR!");
            }
            
            index++;
        }
        
        
        scanner.close();
    }
}
