// Main.java

public class Main {
    public static void main(String[] args) {
        // Print header for the Pokémon Battle Simulator
        System.out.println("=== Pokémon Battle Simulator ===");

        // Define Pikachu's moves and damage
        String[] pikachuMoves = {"Thunderbolt", "Wild Charge", "Iron Tail", "Quick Attack"};
        int[] pikachuDamage = {8, 10, 6, 4};

        // Define Snivy's moves and damage
        String[] snivyMoves = {"Leaf Storm", "Vine Whip", "Tackle", "Magical Leaf"};
        int[] snivyDamage = {10, 6, 5, 7};

        // Creating Pokémon objects with their name, type, moves, and damage values
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", pikachuMoves, pikachuDamage);
        Pokemon snivy = new Pokemon("Snivy", "Grass", snivyMoves, snivyDamage);

