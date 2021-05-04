package day16_switch_ternary;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class AdaireApartments {
    public static void main(String[] args) {
        int numberOfBedrooms = 4;
        double startingPrice = 0;
        System.out.println("########## WELCOME TO ADAIRE APARTMENTS ##########");

        switch(numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899.0;
                break;
            default:
                System.out.println(numberOfBedrooms + " bedrooms is currently unavailable");
               return; //exit main method
        }

        System.out.println("Starting price $" + startingPrice);
    }
}
