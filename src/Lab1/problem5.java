package Lab1;

public class problem5 {

    public static boolean bracketCheck(String b) {
        int bCheck = 0;
        for (char c : b.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                bCheck++;
            } else {
                bCheck--;
                if (bCheck < 0) {
                    return false;
                }

                // Check for mismatched brackets
                if (c == ')' && b.charAt(b.length() - 1 - bCheck) != '(' ||
                        c == '}' && b.charAt(b.length() - 1 - bCheck) != '{' ||
                        c == ']' && b.charAt(b.length() - 1 - bCheck) != '[') {
                    return false;
                }
            }
        }

        // Check for any remaining unmatched brackets
        return bCheck == 0;
    }

    public static void main(String[] args) {
        String bracket = "()";
        boolean result = bracketCheck(bracket);
        System.out.println(result);
    }
}

