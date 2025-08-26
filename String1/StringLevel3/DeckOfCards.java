package StringLevel3;

import java.util.Scanner;

public class DeckOfCards {

    // Suits and ranks
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                             "Jack", "Queen", "King", "Ace"};

    // Method to initialize the deck
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            // swap deck[i] and deck[randomCardNumber]
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute cards to players
    public static void distributeCards(String[] deck, int numPlayers, int numCardsPerPlayer) {
        String[][] players = new String[numPlayers][numCardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCardsPerPlayer; j++) {
                if (cardIndex < deck.length) {
                    players[i][j] = deck[cardIndex++];
                }
            }
        }

        // Print the cards each player has
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < numCardsPerPlayer; j++) {
                if (players[i][j] != null)
                    System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize and shuffle the deck
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        // Take user input for number of players and cards per player
        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int numCardsPerPlayer = sc.nextInt();

        // Check if enough cards to distribute
        if (numPlayers * numCardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
        } else {
            // Distribute and print
            distributeCards(deck, numPlayers, numCardsPerPlayer);
        }

        sc.close();
    }
}
