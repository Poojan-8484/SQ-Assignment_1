package StatisticalLibrary;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Library of Statistical Calculations
 * Includes functions for finding the minimum value, maximum value, median value
 and the mean
 */
public class StatisticalLibrary {

    /**
     * Calculates the mean (average) from array.
     *
     * @param array    the ArrayList of doubles .
     * @param min    min value if there is specific condition to check for array value (ex. Negetive )
     * @param isCutOff true if there is cirteria for minimum value
     * @return return mean value
     */
    public static double meanValue(ArrayList<Double> array, double min, boolean isCutOff){
        double meanValue = 0;
        int count = 0;
        for(double number: array){
            if(isCutOff) {
                if(number>= min) {
                    meanValue += number;
                    count++;
                }
            }
            else{
                meanValue += number;
                count++;
            }
        }
        return meanValue/count;
    }

    /**
     * Calculates the median from array.
     *
     * @param array ArrayList of Double .
     * @return The median value
     */

    public static double medianValue(ArrayList<Double> array){
        double medianValue = 0;
        if(array.size() %2 == 1){
            medianValue = array.size()/2;
            medianValue = array.get((int)medianValue);
        }
        else{
            medianValue = ( array.get((int)((array.size())/2)-1) + array.get((int)(array.size()/2)) ) / 2;
        }
        return medianValue;
    }


    /**
     * Calculates minimum Number from Array
     *
     * @param array ArrayList of Double .
     * @return The minimum value
     */
    public static double minimumValue(ArrayList<Double> array){
        // Defult value to start comparision.
        double minimumValue = array.get(0);
        for(double number : array){
            //Check and replace if any small number found from array.
            if(number<minimumValue){
                minimumValue=number;
            }
        }
        return minimumValue;
    }


    /**
     * Calculates maximum Number from Array
     *
     * @param array ArrayList of Double .
     * @return The maxvalue value
     */
    public static double maxValue(ArrayList<Double> array){
        //Initial value for comparision.
        double maxValue = array.get(0);
        for(double number : array){
            if(number>maxValue){
                maxValue=number;
            }
        }
        return maxValue;
    }


    /**
     * Entry point for the Java programs .
     *
     * 1. Create temporary array to test data.
     * @param args no use
     */
    public static void main(String[] args) {
        ArrayList<Double> data = new ArrayList<>();
        Collections.addAll(data,25.5, 29.4, 36.7, 43.1, 57.9, 88.3, 99.9, 100.0 );
        System.out.println("Mean Value from array is : " + meanValue(data, 0, true));
        System.out.println("Median (center) of the array is: " + medianValue(data));
        System.out.println("Minimum number from array is : " + minimumValue(data));
        System.out.println("maximum number from array is : " + maxValue(data));
    }
}
