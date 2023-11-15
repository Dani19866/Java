/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Daniel
 */
public class Game {

    private Hashtable<String, Integer> card_counts = new Hashtable<>();
    private Hashtable<String, String> card_path = new Hashtable<>();
    private Hashtable<Integer, String[]> players = new Hashtable<>();
    private int HI_Lo;
    private int spent_cards;
    private int limit = 16;
    private int limitDealer = 17;

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Game() {
        this.temp();

        // Building players: 6 bots, dealer & player
        int numBots = 6;
        int dealer = 1;
        int player = 1;
        for (int i = 0; i < (numBots + dealer + player); i++) {
            players.put(i, new String[0]);
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Automatic functions">
    private void downloaderFiles() {}

    private void load_paths() {}

    private void temp() {
        // 1. Path route
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "images" + File.separator + "card" + File.separator;

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
                    String nameFile = this.regex_completeNameFile(pathFile.toString());

                    // Card counts
                    card_counts.put(nameFile, 6);

                    // Card path
                    card_path.put(nameFile, pathFile.toString());
                }
            }
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Functions">
    public String card() {
        // Random algorithm to obtain key
        ArrayList<String> keys = new ArrayList<>(card_path.keySet());
        Random random = new Random();

        // Key
        String randomKey = keys.get(random.nextInt(keys.size()));

        // Card: Discount 1. Return path
        int quantity = card_counts.get(randomKey);
        if (quantity > 0) {
            // Discount
            card_counts.put(randomKey, quantity - 1);
            spent_cards++;

            // HI-Lo
            this.HI_Lo(randomKey);

            // Return
            return card_path.get(randomKey);
        } // Recursive
        else {
            System.out.println("[%] Se acabó la carta: " + randomKey);
            return this.card();
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="HI-Lo">
    private void HI_Lo(String value) {
        value = this.regex_shortNameFile(value);
        if (value.matches("-?\\d+")) {
            int number = Integer.parseInt(value);
            if (number >= 2 && number <= 6) {
                this.HI_Lo++;
            }
        } else {
            this.HI_Lo--;
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Probabilities">
    public int playerProbabilitiesToDefeat(int quantity) {
        switch (quantity) {
            case 12:
                return 31;
            case 13:
                return 39;
            case 14:
                return 56;
            case 15:
                return 58;
            case 16:
                return 62;
            case 17:
                return 69;
            case 18:
                return 77;
            case 19:
                return 85;
            case 20:
                return 92;
            default:
                return 0;
        }
    }

    public int dealerProbabilitiesToDefeat(int quantity) {
        switch (quantity) {
            case 2:
                return 36;
            case 3:
                return 37;
            case 4:
                return 40;
            case 5:
                return 43;
            case 6:
                return 42;
            case 7:
                return 26;
            case 8:
                return 24;
            case 9:
                return 23;
            case 10:
                return 21;
            default:
                return 11;
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Regex">
    private String regex_completeNameFile(String chain) {
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile("card\\\\([^\\.]+)\\.png");
        matcher = pattern.matcher(chain);

        if (matcher.find()) {
            String value = matcher.group(1);
            return value;
        }

        return null;
    }

    private String regex_shortNameFile(String chain) {
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile("^(.*?)_");
        matcher = pattern.matcher(chain);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return null;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getLimit() {
        return limit;
    }

    public int getHI_Lo() {
        return this.HI_Lo;
    }

    public int getUsedCards() {
        return this.spent_cards;
    }
    
    public int getLimitDealer(){
        return this.limitDealer;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters"> 
    public void setLimit(int value) {
        limit = value;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Game cycle">
    public void saveCards(int player, String card) {
        // Card short name
        card = this.regex_shortNameFile(this.regex_completeNameFile(card));

        // Obtain list of cards (String)
        String[] oldList = players.get(player);
        String[] newList = new String[oldList.length + 1];
        
        // First hand and card
        switch (oldList.length) {
            case 0:
                newList[0] = card;
                break;
            case 1:
                newList[0] = oldList[0];
                newList[1] = card;
                break;
            case 2:
                newList[0] = oldList[0];
                newList[1] = oldList[1];
                newList[2] = card;
                break;
            case 3:
                newList[0] = oldList[0];
                newList[1] = oldList[1];
                newList[2] = oldList[2];
                newList[3] = card;
                break;
            case 4:
                newList[0] = oldList[0];
                newList[1] = oldList[1];
                newList[2] = oldList[2];
                newList[3] = oldList[3];
                newList[4] = card;
                break;
            case 5:
                newList[0] = oldList[0];
                newList[1] = oldList[1];
                newList[2] = oldList[2];
                newList[3] = oldList[3];
                newList[4] = oldList[4];
                newList[5] = card;
                break;
            case 6:
                newList[0] = oldList[0];
                newList[1] = oldList[1];
                newList[2] = oldList[2];
                newList[3] = oldList[3];
                newList[4] = oldList[4];
                newList[5] = oldList[5];
                newList[6] = card;
                break;
        }
        
        players.put(player, newList);
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Utilities">
    public int points(int player){
        String[] cards = players.get(player);
        int points = 0;
        // --------------------------------------------------------------------
        for (String card : cards) {
            // Si la carta es número
            if (card.matches("-?\\d+")) {
                int number = Integer.parseInt(card);
                points += number;
            }
            
            else {
                // Si la carta es JQO
                if (!"ace".equals(card)){
                    points += 10;
                }
                else {
                    points += 11;
                }
            }
        }
        // --------------------------------------------------------------------
        if (points > 21 && Arrays.asList(cards).contains("ace")){
            points -= 10;
        }
        // --------------------------------------------------------------------
        // Algorithm to play with 2 (aces)

        // --------------------------------------------------------------------
        return points;
    }
    
    public void resetValues(){
        int numBots = 6;
        int dealer = 1;
        int player = 1;
        for (int i = 0; i < (numBots + dealer + player); i++) {
            players.put(i, new String[0]);
        }
    }
    //</editor-fold>
}
