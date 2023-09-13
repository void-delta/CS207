import java.util.Scanner;

class String5 {

    static boolean containsAllCharacters(String substr, String pattern) {
        int[] count = new int[256];
        for (char ch : pattern.toCharArray())
            count[ch]++;
        for (char ch : substr.toCharArray()) {
            if (count[ch] > 0)
                count[ch]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0)
                return false;
        }
        return true;
    }

    static String findSmallestSubstring(String str, String pattern) {
        int lenStr = str.length();
        String smallestSubstring = "";
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < lenStr; i++) {
            for (int j = i; j < lenStr; j++) {
                String substr = str.substring(i, j + 1);

                if (containsAllCharacters(substr, pattern)) {
                    int currentLength = substr.length();

                    if (currentLength < minLength) {
                        minLength = currentLength;
                        smallestSubstring = substr;
                    }
                }
            }
        }

        return smallestSubstring;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        System.out.print("Enter the pattern: ");
        String pattern = scan.nextLine();
        String result = findSmallestSubstring(str, pattern);
        System.out.println("Smallest substring containing all characters of the pattern: " + result);

        scan.close();
    }
}
