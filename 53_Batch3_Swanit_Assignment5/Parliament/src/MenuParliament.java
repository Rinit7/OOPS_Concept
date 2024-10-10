//Author:Swanit Rivankar
//RollNo:2453
//Title:Parliament of India
//Start Date:24th September 2024
//Modified Date:6th October 2024
//Description:This program is implementing the working of parliament of India. It contains various classes to add members to Rajya Sabha and Lok Sabha and also to add the President.

import java.util.Scanner;

public class MenuParliament {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pname;
        int pterm, pyear, lok_mem, raj_mem, t;
        
        President p1 = new President();
        Parliament lokSabha = new Loksabha();
        Parliament rajyaSabha = new Rajyasabha();

        boolean f = true;
        while (f) {
            System.out.print("\nEnter Your Choice:\n1: Enter President Details\n2: Add LokSabha members\n3: Add RajyaSabha Members\n4: Display President Details\n5: Display LokSabha Details\n6: Display RajyaSabha Details\n7: EXIT\n");
            t = s.nextInt();

            switch (t) {
                case 1:
                    System.out.printf("\nEnter President name, term and year:\n");
                    pname = s.next();
                    pterm = s.nextInt();
                    pyear = s.nextInt();
                    p1.addPresident(pname, pterm, pyear);
                    break;

                case 2:
                    System.out.printf("\nEnter number of LokSabha members to add:\n");
                    lok_mem = s.nextInt();
                    for (int i = 0; i < lok_mem; i++) {
                        System.out.printf("\nEnter member name and party:\n");
                        String memberName = s.next();
                        String party = s.next();
                        lokSabha.addMember(memberName, party);
                    }
                    break;

                case 3:
                    System.out.printf("\nEnter number of RajyaSabha members to add:\n");
                    raj_mem = s.nextInt();
                    for (int i = 0; i < raj_mem; i++) {
                        System.out.printf("\nEnter member name and party:\n");
                        String memberName = s.next();
                        String party = s.next();
                        rajyaSabha.addMember(memberName, party);
                    }
                    break;

                case 4:
                    p1.displayInfo();
                    break;

                case 5:
                    lokSabha.displayMembers();
                    break;

                case 6:
                    rajyaSabha.displayMembers();
                    break;

                case 7:
                    System.out.println("End Of Code");
                    f = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
