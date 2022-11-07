package AnagramUsingStack;

public class AnagramStack {
    public static int[] count(int n) {
        int[] count = new int[10];
        int temp = n;
        while (temp != 0) {
            int r = temp % 10;
            count[r]++;
            temp = temp / 10;
        }
        return count;
    }

    public static boolean anagram(int n1, int n2) {
        int[] n1count = count(n1);
        int[] n2count = count(n2);
        for (int i = 0; i < n2count.length; i++) {
            if (n1count[i] != n2count[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        ReverseOrder<Integer> reverseOrder = new ReverseOrder<Integer>();
        boolean b;
        for (int j = 2; j <= 1000; j++) {
            b = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                reverseOrder.add(j);
        }
        for (int i = 0; i < reverseOrder.size(); i++) {
            for (int j = i + 1; j < reverseOrder.size(); j++) {
                if (AnagramStack.anagram(reverseOrder.get(i), reverseOrder.get(j))) {
                    stack.push(reverseOrder.get(i));
                    stack.push(reverseOrder.get(j));
                }
            }
        }

        stack.display();
    }
}