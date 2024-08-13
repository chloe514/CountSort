public class CountSort {
    public static String countSort(String arr) {
        int N = arr.length();
        // Create a count array to store count of individual characters
        int[] count = new int[26]; // Since there are 26 lowercase English letters

        // Store count of each character
        for (int i = 0; i < N; i++) {
            count[arr.charAt(i) - 'a']++;
        }

        // Build the output character array
        char[] output = new char[N];
        int index = 0;

        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                output[index++] = (char) (i + 'a');
            }
        }

        return new String(output);
    }

    public static void main(String[] args) {
        String S1 = "edsab";
        System.out.println(countSort(S1)); // Output: abdes

        String S2 = "geeksforgeeks";
        System.out.println(countSort(S2)); // Output: eeeefggkkorss
    }
}

