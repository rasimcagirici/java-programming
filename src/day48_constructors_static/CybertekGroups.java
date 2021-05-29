package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {

        Group group1 = new Group("Cyberbugs");
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");
        System.out.println(group1.getMembers().size());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen","Wahshum","Akrem","Bulent","Andreea","Andrei"));
        System.out.println("Group2 members = " +  group2.getMembers());

        if (group2.getMembers().contains("Akrem")) {
            System.out.println("Akrem is on index " + group2.getMembers().indexOf("Akrem"));
        } else {
            System.out.println("Akrem is not on list");
        }
    }
}
