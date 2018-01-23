package edu.cnm.deepdive.temperature;

public class Converter {
                
/*  public static double celciusToFahrenheit(double celsius) {
    double fahrenheit = 9 * celsius / 5 + 32; //everything is converted to double
    return fahrenheit;
  }                                      
  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = 5 * (fahrenheit - 32) / 9;
    return celsius; //celsius is local
    */
                   //output type and name //input parameter and name
  public static double celciusToFahrenheit(double celsius) {
    return 9 * celsius / 5 + 32; //everything is converted to double
  }
                                          //double fahrenheit is local variable
  public static double fahrenheitToCelsius(double fahrenheit) {
    return 5 * (fahrenheit - 32) / 9;
  }
}