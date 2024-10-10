//Author:Swanit Rivankar
//RollNo:2453
//Title:Parliament of India
//Start Date:24th September 2024
//Modified Date:6th October 2024
//Description:This program is implementing the working of parliament of India. It contains various classes to add members to Rajya Sabha and Lok Sabha and also to add the President.

public class Mem {
    private String name;
    private String party;

    public Mem(String name, String party) {
        this.name = name;
        this.party = party;
    }

    public String getName() {
        return name;
    }

    public String getParty() {
        return party;
    }
}

