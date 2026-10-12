class Solution {
    public double[] convertTemperature(double celsius) {
            Double Kelvin = celsius + 273.15;
            Double Fahrenheit = celsius * 1.80 + 32.00;
            
        return new double[]{Kelvin,Fahrenheit};
    }
}