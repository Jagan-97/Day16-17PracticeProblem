import java.util.ArrayList;
import java.util.List;

public class PermutationUsingRecurssiveAndIterative{
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    private static void permutations(char[] chars, int currentIndex) {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }

        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }

    public static void RecursionPermutations(String str) {
        if (str == null || str.length() == 0) {
            return;
        }

        permutations(str.toCharArray(), 0);
    }

    public static void IterationPermutations(String str)
    {
        if (str == null || str.length() == 0) {
            return;
        }
        List<String> partial = new ArrayList<>();
        partial.add(String.valueOf(str.charAt(0)));
        // do for every character of the specified string
        for (int i = 1; i < str.length(); i++)
        {
            // (iterate backward to avoid ConcurrentModificationException)
            for (int j = partial.size() - 1; j >= 0 ; j--)
            {
                String s = partial.remove(j);
                for (int k = 0; k <= s.length(); k++)
                {
                    partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
                }
            }
        }

        System.out.println("IterativePermutation = " +partial);
    }

    // generate all permutations of a string in Java
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("RecursivePermutation");
        RecursionPermutations(str);
        IterationPermutations(str);
    }
}
