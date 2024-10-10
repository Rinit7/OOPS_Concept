//Author:Swanit Rivankar
//RollNo:2453
//Title:Parliament of India
//Start Date:24th September 2024
//Modified Date:6th October 2024
//Description:This program is implementing the working of parliament of India. It contains various classes to add members to Rajya Sabha and Lok Sabha and also to add the President.

public class President {
    private int term, year_elec;
    private String pname;


    public President() {
        this.pname = null;
        this.term = 0;
        this.year_elec = 0;
    }

    public void addPresident(String pname, int term, int year_elec) {
        this.pname = pname;
        this.term = term;
        this.year_elec = year_elec;
    }

    public String getPname() {
        return pname;
    }

    public int getTerm() {
        return term;
    }

    public int getYearElec() {
        return year_elec;
    }

    public void displayInfo() {
        System.out.println("\nPresident Info");
        System.out.printf("Name: " + pname + "\nTerm: " + term + "\nYear Elected: " + year_elec + "\n");
    }
}

