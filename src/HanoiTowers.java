/*
 * CS2050 - Computer Science II - Fall 2023
 * Instructor: Thyago Mota
 * Student:
 * Description: Activity 04 - HanoiTower
 */

public class HanoiTowers {

    static final int NUMBER_RODS  = 3;
    static final int NUMBER_DISKS = 5;

    // a recursive method to solve the hanoi towers puzzle
    static int move(Rod[] rods, int n, int source, int target, int aux) throws Exception {

        // TODO #1: check whether the base case was reached


        // TODO #2: recursively solve for problem size n-1

        return 0;
    }

    // returns a string with the state of the rods
    public static String rodsToString(Rod[] rods) {
        String str = "";
        for (int i = 0; i < NUMBER_RODS; i++)
            str += "rod[" + i + "]: " + rods[i].toString() + "\n";
        return str;
    }

    public static void main(String[] args) throws Exception {

        // rods initialization
        Rod[] rods = new Rod[NUMBER_RODS];
        for (int i = 0; i < NUMBER_RODS; i++)
            rods[i] = new Rod();
        for (int disk = NUMBER_DISKS; disk >= 1; disk--)
            rods[0].push(disk);

        // displays rods before
        System.out.println(rodsToString(rods));

        // solves the hanoi towers puzzle recursively
        int moves = move(rods, NUMBER_DISKS, 0, 1, 2);

        // displays rods after
        System.out.println(rodsToString(rods));

        // shows the number of moves required to solve the puzzle
        System.out.println("Solved with " + moves + " moves!");
    }
}