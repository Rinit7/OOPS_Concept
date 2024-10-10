//Author:Swanit Rivankar
//RollNo:2453
//Title:Parliament of India
//Start Date:24th September 2024
//Modified Date:6th October 2024
//Description:This program is implementing the working of parliament of India. It contains various classes to add members to Rajya Sabha and Lok Sabha and also to add the President.

import java.util.ArrayList;
import java.util.List;

public class Loksabha extends Parliament {
    private List<Mem> members;


    public Loksabha() {
        this.members = new ArrayList<>();
    }

    @Override
    public void addMember(String name, String party) {
        members.add(new Mem(name, party));
    }

    @Override
    public void displayMembers() {
        System.out.println("\nLokSabha Details:");
        System.out.println("Role: Represents the people of India\nMaximum members: 552\nTerm: 5 Years");
        System.out.println("\nLokSabha Members:");
        if (members.isEmpty()) {
            System.out.println("No Members added");
        } else {
            for (Mem member : members) {
                System.out.println("Name: " + member.getName() + ", Party: " + member.getParty());
            }
        }
    }
}

