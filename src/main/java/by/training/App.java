package by.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dancer dancer = new Dancer(new Input().danceCode);
        Dance dance = new Dance(dancer);
        System.out.println(dance.steps);
        dance.dance();
        System.out.println(dance.steps);
    }
}
