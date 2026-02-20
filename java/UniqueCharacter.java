public class UniqueCharacter {

    public static boolean hasAllUniqueCharacters(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < 'a' || c > 'z') {
                throw new IllegalArgumentException("Character '" + c + "' is not a lowercase letter (a-z).");
            }
            int bitIndex = c - 'a';
            if ((checker & (1 << bitIndex)) != 0) {
                return false;
            }
            checker |= (1 << bitIndex);
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {"abcdef", "aabcde", "xyz", "aabb", "programming"};
        for (String input : testCases) {
            System.out.println("\"" + input + "\" -> " +
                    (hasAllUniqueCharacters(input) ? "All unique" : "Has duplicates"));
        }
    }
}
