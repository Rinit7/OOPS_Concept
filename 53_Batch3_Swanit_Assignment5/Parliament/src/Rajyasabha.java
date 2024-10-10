//Author:Swanit Rivankar
//RollNo:2452
//Title:Parliament of India
//Start Date:9 July 2024
//Modified Date:23 July 2024
//Description:This program is implementing the working of parliament of India. It contains various classes to add members to Rajya Sabha and Lok Sabha and also to add the President.

import java.util.ArrayList;
import java.util.List;

public class Rajyasabha extends Parliament {
    private List<Mem> members;

    public Rajyasabha() {
        this.members = new ArrayList<>();
    }

    @Override
    public void addMember(String name, String party) {
        members.add(new Mem(name, party));
    }

    @Override
    public void displayMembers() {
        System.out.println("\nRajyaSabha Details:\nRole: Represents the states and union territories\nMaximum Members: 250\nTerm: 6 Years");
        System.out.println("\nRajyaSabha Members:");
        if (members.isEmpty()) {
            System.out.println("No Members added");
        } else {
            for (Mem member : members) {
                System.out.println("Name: " + member.getName() + ", Party: " + member.getParty());
            }
        }
    }
}

