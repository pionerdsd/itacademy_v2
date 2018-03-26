package by.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         int [] danceCode = new int[]{1, 2, 3, 4, 5};

        new Dance(new Dancer(danceCode)).dance();
    }
}
