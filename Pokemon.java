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
