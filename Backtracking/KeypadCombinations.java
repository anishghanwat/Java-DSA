/* Question 2: Keypad Combinations
Given a string containing digits from 2-9 inclusive, print all possible letter combinations that the number could represent. 
You can print the answer in any order. A mapping of digits to letters (just like on the telephone buttons) is given below.
Note that 1 does not map to any letters. */
public class KeypadCombinations {
    final static char[][] L = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public static void letterCombinations(String digit) {
        int len = digit.length();

        if (len == 0) {
            System.out.println("");
            return;
        }
        bfs(0, len, new StringBuilder(), digit);
    }

    public static void bfs(int index, int len, StringBuilder sb, String digit) {
        if (index == len) {
            System.out.println(sb.toString());
        } else {
            char[] letters = L[Character.getNumericValue(digit.charAt(index))];
            for (int i = 0; i < letters.length; i++) {
                bfs(index + 1, len, new StringBuilder(sb).append(letters[i]), digit);
            }
        }
    }

    public static void main(String[] args) {
        String digit = "23";
        letterCombinations(digit);
    }
}



