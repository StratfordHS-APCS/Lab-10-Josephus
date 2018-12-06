/**
 * 
 */
public class Josephus
{
    // You can use this to reduce the array by 1 spot (at loction "loc").
    // Remember, you can't change the size of an array, but you can copy 
    // some of the values into a new, smaller, array.
    private static int[] kill( int[] array, int loc )
    {
        int[] newArr = new int[ array.length - 1 ];  // The new, smaller, array that will be returned.
        int spot = 0;   // keep track of your location in the new array.
        
        // use a for loop to fill the new array with the still-living portions of the old array.
        
        return newArr;
    }
    
    // returns the starting location of the last survivor
    public static int safeLocation( int numSpots, int count )
    {
        int[] alive = new int[numSpots];   // the array of survivors
        int currLoc = 0;  // start at zero, but increment before killing.  
                          // As you kill, make sure this points to the correct new location.
        
        // Fill the spots with their starting location number (0 -> numSpots) so we always know where they started.
        
        // Proceed increment currLoc by count (wrapping around the end) and killing each location found.
        // Continue until only one location is left.
        
        return alive[0];  // there is only one location in the array at this point.
    }
    
    // You can use this, or not, as a place to start to answer the questions asked in the Readme.
    public static void runTest()
    {
        for( int i = 1; i < 10; i++ )
        {
            for( int j = 1; j < 10; j++ )
            {
                safeLocation( i, j );
            }
        }
    }
}