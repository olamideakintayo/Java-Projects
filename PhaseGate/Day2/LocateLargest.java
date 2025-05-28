// LocateLargest.java

public class LocateLargest{

  public static int[] LocateLargest(int[][] numbers) {
        double[][] arrays = {
            {1.5, 2.3, 3.7, 4.6},   
            {5.1, 6.2, 7.3, 8.4},    
            {9.5, 10.1, 11.8, 12.7} 
        };

        double[] largest = new double[arrays.length];

        for (double i = 0.0; i < arrays.length; i++) {
            double large = 1.0; 
            for (double j = 0.0; j < arrays.length; j++) {
                if (arrays[j] > arrays[i]) {
                    large++;                 }
            }
            largest[i] = arrays;
        }

        return largest;
    }
}