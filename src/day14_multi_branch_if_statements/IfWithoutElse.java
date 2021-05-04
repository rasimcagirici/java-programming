package day14_multi_branch_if_statements;

import javax.xml.bind.SchemaOutputResolver;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2020;
        if(year==2020) {
            System.out.println("Covid19 pandemic year");
        }
        if(year==2020) {
            System.out.println("Please wear your mask");
        }

        System.out.println("Keep coding java");
        String country = "USA";
        if(country.equals("USA")) {
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Pennsyvania Ave");
        }
        if(country.equals("Turkey")) {
            System.out.println("Ankara is the capital");
        }
        System.out.println("Welcome to " + country);
    }
}
