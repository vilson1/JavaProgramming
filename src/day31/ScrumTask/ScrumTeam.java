package day31.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO,BA,SM;
    public ArrayList<Tester> testersList=new ArrayList<>();
    public ArrayList<Developer> developersList=new ArrayList<>();
    public int doysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int doysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.doysOfSprint = doysOfSprint;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester[] testers){

        testersList.addAll(Arrays.asList(testers));

    }

    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }

    public void addDevelopers(Developer[] developers){

        developersList.addAll(Arrays.asList(developers));

    }

    public void removeTester(int emloyeeID){
        testersList.removeIf(p->p.employeeId==emloyeeID);
    }
    public void removeDeveloper(int emloyeeID){
        developersList.removeIf(p->p.employeeId==emloyeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                "Total number of testers = "+testersList.size()+
                "Total number of develoters = "+developersList.size()+
                '}';
    }
}
