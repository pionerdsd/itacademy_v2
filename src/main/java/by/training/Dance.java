package by.training;

/**
 * Created by dmurashko on 26.03.2018.
 */
public class Dance {

    public int steps;
    private int position;
    private int[] danceCode;

    public Dance(Dancer dancer) {

        this.position = 0;
        this.steps = 0;
        this.danceCode = dancer.danceCode;
    }

    public void dance() {
        for (int i = 0; i < danceCode.length; i++) {
            if (danceCode[i] % 2 != 0) {
                back(danceCode[i], i);
            } else {
                forward(danceCode[i]);
            }
        }
    }

    private void forward(int num) {
        if (position + num <= danceCode.length) {
            steps += num;
            position += num;
        } else {
            steps += position;
            position = 0;
        }

    }

    private void back(int num, int i) {

        if (i != 0) {
            if (position - num >= 0) {
                steps += num;
                position -= num;
            } else {
                steps += position;
                position = 0;

            }
        }


    }


}
