package by.training;

/**
 * Created by dmurashko on 26.03.2018.
 */
public class Parser {
   private String val;

    public Parser(String val) {
        this.val = val;
    }



    public String checkVal() {
        if ((val.matches("^[0-9]{1,10}$"))) {
            return val;
        }

        return "q";
    }
}
