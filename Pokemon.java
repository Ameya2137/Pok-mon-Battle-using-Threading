// Pokemon.java

import java.util.Random;

public class Pokemon {
    // Declare attributes for the Pokémon's name, type, health, moves, and damage values
    private String name;
    private String type;
    private int hp;
    private String[] moves;
    private int[] damageValues;
    private Random rand = new Random();  // Random object for selecting moves

    // Constructor to initialize Pokémon with name, type, moves, and damage values
    public Pokemon(String name, String type, String[] moves, int[] damageValues) {
        this.name = name;
        this.type = type;
        this.hp = 30;  // Default HP for Pokémon is set to 30
        this.moves = moves;
        this.damageValues = damageValues;
    }

