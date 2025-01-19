import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        List<Map<String, Integer>> lines = getLines(args);
        printLines(lines);
    }

    public static List<Map<String, Integer>> getLines(String[] args) {
        List<Map<String, Integer>> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String name = scanner.next();
            int value = scanner.nextInt();

            Map<String, Integer> result = new HashMap<>();
            result.put(name, value);
            list.add(result);
        }

        scanner.close();
        
        return list;
    }
    
    public static void printLines(List<Map<String, Integer>> list) {
    	System.out.println("================================");
    	for (int i = 0;i<list.size();i++) {
    		Map<String, Integer> map = list.get(i);
    		map.forEach((k, v) -> { System.out.printf("%-15s%03d\n", k, v); });
    		
    	}
    	
    	System.out.println("================================");

    }
}
