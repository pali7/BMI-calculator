
package bmicalculator;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;


public class BMICalculator {

   
    public static void main(String[] args) {
        double weight;
                int height;
      Scanner SC= new Scanner(System.in);
      
      System.out.println("Enter your weight in kg:");
      weight= SC.nextDouble();
      
        System.out.println("Enter your height in meter:");
        height= SC.nextInt();
        
        double bmi= weight/Math.pow(height, 2.0);
        System.out.println("your BMI is:" +bmi);
        
        if (bmi<18.5){
        System.out.println("Underweight");
    }
        else if (bmi >= 18.5 && bmi<24.9){
                System.out.println("Normal");
                }
        else if (bmi >= 24.9 && bmi<30){
                System.out.println("Overweight");
                }
        else if (bmi >= 30){
                System.out.println("Obesity");
                }
    } 
      
    }
   
