/*
 * CS2050 - Computer Science II - Fall 2023
 * Instructor: Thyago Mota
 * Student:
 * Description: Activity 04 - Rod
 */

import java.util.Stack;

// abstracts a hanoi towers rod using a stack of integers to represent disks of different sizes
public class Rod {

    private Stack<Integer> disks;

    public Rod() {
        disks = new Stack<>();
    }

    // returns the disk that is on top of the rod
    public int pop() {
        return disks.pop();
    }

    // adds a disk on top of the rod, checking the hanoi towers restriction for disk placement
    public void push(int disk) throws Exception {
        if (!isEmpty() && disk >= disks.peek())
            throw new Exception("Wrongful disk placement!");
        disks.push(disk);
    }

    // returns true/false depending on whether the rod is empty
    public boolean isEmpty() {
        return disks.isEmpty();
    }

    @Override
    public String toString() {
        return "bottom " + disks.toString() + " top";
    }
}
