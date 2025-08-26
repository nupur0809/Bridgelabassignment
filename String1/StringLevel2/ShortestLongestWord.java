package StringLevel2;

import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitWords(String text) {
        return text.split(" ");
    }

    public static void findShortestAndLongest(String[] words) {
        String shortest = words[0], longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }

        System.out.println("Shortest Word: " + shortest);
        System.out.println("Longest Word: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        findShortestAndLongest(words);

        sc.close();
    }
}
