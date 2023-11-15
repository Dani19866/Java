/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import utils.Utils;

/**
 *
 * @author Daniel
 */
public class Blackjack {

    // Hashtables
    private Hashtable<String, Integer> cardCounts = new Hashtable<>();
    private Hashtable<String, String> cardPaths = new Hashtable<>();
    public Hashtable<Integer, String[]> players = new Hashtable<>();

    // Limits
    private int limitDealer;
    private int limitBot;
    private double limitCards;
    private int limit;

    // Counters
    private int countHILo;
    private int cards;

    // Game
    private int mallet;

    // ------------------------------------------------------------------------
    private void loadFiles() {
        // 1. Path route
        String path = "C:\\Blackjack\\cards\\";

        // 2. Directory class
        File directory = new File(path);

        // 3. Ver archivos
        if (directory.isDirectory()) {
            File[] archivos = directory.listFiles();

            // 3.1. Si el array no está vacío
            if (archivos != null) {

                // 3.1.1. Imprime todos los valores dentro del array
                for (File pathFile : archivos) {
                    // Name card
                    String nameCard = Utils.regex_completeNameFile(pathFile.toString());
                    // Name path
                    String namePath = pathFile.toString();

                    // Card counts
                    cardCounts.put(nameCard, mallet);

                    // Card path
                    cardPaths.put(nameCard, namePath);
                }
            }
        }
    }

    // ------------------------------------------------------------------------
    public Blackjack() {
        // Values
        cards = 0;
        countHILo = 0;
        
        // Mallet (4 default)
        mallet = 4;
        
        // Limits
        limitDealer = 17;
        limitBot = 16;
        limit = 21;
        limitCards = (52 * mallet) * 0.70;

        // Automatic
        createPlayers();
        loadFiles();
    }

    private void createPlayers() {
        int numBots = 6;
        int dealer = 1;
        int player = 1;

        for (int i = 0; i < (numBots + dealer + player); i++) {
            players.put(i, new String[0]);
        }
    }

    private void HILo(String card) {
        // 10, ace, queen, 6, etc
        card = Utils.regex_shortNameFile(card);
        if (card.matches("-?\\d+")) {
            int number = Integer.parseInt(card);
            if (number >= 2 && number <= 6) {
                this.countHILo++;
            }
        } else {
            this.countHILo--;
        }
    }

    public String card() {
        // Random algorithm to obtain key
        ArrayList<String> keys = new ArrayList<>(cardPaths.keySet());
        Random random = new Random();

        // Key
        String randomKey = keys.get(random.nextInt(keys.size()));

        // Card: Discount 1. Return path
        int quantity = cardCounts.get(randomKey);
        if (quantity > 0) {
            // Discount
            cardCounts.put(randomKey, quantity - 1);
            cards++;

            // HI-Lo
            this.HILo(randomKey);

            // Return
            return cardPaths.get(randomKey);
        } // Recursive
        else {
            System.out.println("[%] Se acabó la carta: " + randomKey);
            return this.card();
        }
    }

    public int points(int player) {
        String[] cardsOfPlayer = players.get(player);
        int points = 0;
        int aceCount = 0;
        // --------------------------------------------------------------------
        for (String card : cardsOfPlayer) {
            // Si la carta es número
            if (card.matches("-?\\d+")) {
                int number = Integer.parseInt(card);
                points += number;

            } else {
                // Si la carta es JQO
                if (!"ace".equals(card)) {
                    points += 10;
                } // Si la carta es un ACE
                else {
                    points += 11;
                    aceCount++;
                }
            }
        }
        // --------------------------------------------------------------------
        if (points > 21 && aceCount != 0) {
            points -= 10;
        }
        // --------------------------------------------------------------------
        return points;
    }

    public void saveCard(int player, String card) {
        // Card short name
        card = Utils.regex_shortNameFile(Utils.regex_completeNameFile(card));

        // Obtain list of cards (String)
        String[] oldList = players.get(player);
        String[] newList = new String[oldList.length + 1];

        // Copy elements from oldList to newList
        System.arraycopy(oldList, 0, newList, 0, oldList.length);

        // Add the new card to the end of newList
        newList[oldList.length] = card;

        // Update
        players.put(player, newList);
    }

    public void resetAll() {
        cards = 0;
        loadFiles();
        createPlayers();
    }

    public void reset() {
        createPlayers();
    }

    // ------------------------------------------------------------------------
    public int getLimitDealer() {
        return limitDealer;
    }

    public int getLimitBot() {
        return limitBot;
    }

    public double getLimitCards() {
        return Math.round(limitCards);
    }

    public int getCountHILo() {
        int value = Math.round(countHILo / mallet);
        return value;
    }

    public int getLimit() {
        return this.limit;
    }

    public int getCards() {
        return cards;
    }

    public int getTotalCards() {
        return mallet * 52;
    }

    public void setLimitDealer(int x) {
        this.limitDealer = x;
    }

    public void setLimitBot(int x) {
        this.limitBot = x;
    }

    public void setLimitCards(int x) {
        this.limitCards = x;
    }

    public void setMallet(int x) {
        this.mallet = x;
        this.limitCards = (x * 52) * 0.70;
    }
}
