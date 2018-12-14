package Labyrinth;

public class Main {
    public static void main(String[] args) {
        RandomLabyrinth lab = new RandomLabyrinth(10,10);
        lab.makeWall();
        lab.showLabyrinth();
    }
}