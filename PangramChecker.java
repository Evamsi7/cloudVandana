public class PangramChecker {

    public static void main(String[] args) {
        try {
            String sentence = "The quick brown fox jumps over the lazy dog";
            if (isPangram(sentence)) {
                System.out.println("The sentence is a pangram.");
            } else {
                System.out.println("The sentence is not a pangram.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static boolean isPangram(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            throw new IllegalArgumentException("Input sentence is empty or null.");
        }

        sentence = sentence.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {		
                return false;
            }
        }
        return true;
    }
}