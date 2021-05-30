package day48_constructors_static;

import java.util.*;

public class Group {
    private String name;
    private List<String> members;

    public Group(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(String newMember) {
        members.add(newMember);
    }

    public void removeMember(String memberName) {
        members.remove(memberName);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}
