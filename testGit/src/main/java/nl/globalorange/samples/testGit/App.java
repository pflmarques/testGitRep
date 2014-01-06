package nl.globalorange.samples.testGit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Git World!" + 
        		" date: " + GPSWSDateTime.getGPSWSDate() +
        		" time: " + GPSWSDateTime.getGPSWSTime());
    }
}
