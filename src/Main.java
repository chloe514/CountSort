public class Main {
    public static void main(String[] args) {
        CountSort sorter = new CountSort();

        String S1 = "edsab";
        System.out.println(sorter.countSort(S1)); // Output: abdes

        String S2 = "geeksforgeeks";
        System.out.println(sorter.countSort(S2)); // Output: eeeefggkkorss
    }
}
