package at.htlhl.sew2.vorjahr.MethodLog;

public class LetterChecker {
    void main() {
        String[] words = {"hallo", "servus", "najoa", "isso", "Ferien", "Freizeit", "hallo", "jo", "IntelliJ", "Jetbrains"};

        int[] letters = checkLetter(words);

        IO.println("hello: " + letters[0] + ", first: " + letters[1]);
    }

    public static int[] checkLetter(String[] words) {
        int times = 0;
        int first = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("hallo")) times++;
            if (first == -1) first = i;
        }

        return new int[]{times, first};
    }
}
