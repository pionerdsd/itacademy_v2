package by.training;

/**
 * Created by dmurashko on 26.03.2018.
 */
public class Dance {

    public int steps;
    private int position;
    private int [] danceCode;

    public Dance(Dancer dancer) {

        this.position = 0;
        this.steps = 0;
        this.danceCode = dancer.danceCode;
    }

    public void dance() {
        System.out.println(steps);
    }


}
