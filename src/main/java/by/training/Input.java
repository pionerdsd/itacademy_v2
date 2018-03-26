package by.training;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dmurashko on 26.03.2018.
 */
public class Input {
    public int [] danceCode;

    public Input() {
        this.danceCode = input();
    }

    private int[] input() {
        String val;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            System.out.println("Please input numbers and press enter to add a motion in a canceCode. Input any other symbol to exit");
            Scanner in = new Scanner(System.in);
             val = in.nextLine();
            if (new Parser(val).checkVal().equals("q")) {
                break;
            }
            list.add(Integer.valueOf(val));

        }
        return list.stream().filter(t -> t != null).mapToInt(t -> t).toArray();

    }

}

