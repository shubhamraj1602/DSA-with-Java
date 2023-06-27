import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static int firstUniqChar(String s) {
        // Create a hashmap to store character frequency
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequency of each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character and return its index
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If no non-repeating character found, return -1
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int index = firstUniqChar(s);
        System.out.println("Index of the first non-repeating character: " + index);
    }
}
