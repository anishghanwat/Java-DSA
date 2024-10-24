public class RemoveDuplicatesInString {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // recursive task
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeDuplicates(str, idx + 1, newStr, map);
        }
    }

    // Change return type to void, as it doesn't return a value
    public static void removeDuplicates(String str) {
        removeDuplicates("appnnacollege", 0, new StringBuilder(""), new boolean[26]);
    }

    public static void main(String[] args) {
        removeDuplicates("appnnacollege");
    }
}
