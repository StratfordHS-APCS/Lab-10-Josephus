import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JosephusTest.
 *
 * @author  Dave Avis
 * @version 12.5.2018
 */
public class JosephusTest
{
    /**
     * Testing safeLocation for all values from 1, 1 through 10, 10
     */
    @Test(timeout=2000)
    public void safeLocationTest()
    {
        int[] expected = { 0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,0,0,2,2,1,1,0,0,2,0,1,1,2,2,3,2,3,3,0,3,4,1,2,4,4,1,2,0,5,1,5,1,4,5,3,5,0,0,4,2,6,3,5,4,0,0,1,7,6,3,1,4,4,0,0,3,1,1,8,7,2,3,8 };
        int loc = 0;
        for( int i = 1; i < 10; i++ )
        {
            for( int j = 1; j < 10; j++ )
            {
                assertEquals( "safeLocation(" + i + "," + j + ") failed.", expected[ loc ], Josephus.safeLocation(i,j) );
                loc++;
            }
        }
    }
}
