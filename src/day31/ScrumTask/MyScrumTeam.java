package day31.ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {


        Tester tester1= new Tester("Vilson",2020,"tester",100000);
        Tester tester2= new Tester("Fatrion",2021,"tester",120000);
        Tester tester3= new Tester("Taulant",2022,"tester",110000);
        Tester tester4= new Tester("Lana",2023,"tester",123000);

        Developer developer1=new Developer("dev1",1020,"developer",130000);
        Developer developer2=new Developer("dev2",1021,"developer",100000);
        Developer developer3=new Developer("dev3",1022,"developer",110000);
        Developer developer4=new Developer("dev4",1023,"developer",120000);
        Developer developer5=new Developer("dev5",1024,"developer",135000);

        Tester[] testers={tester1,tester2,tester3,tester4};
        Developer[] developers={developer1,developer2,developer3,developer4,developer5};

        ScrumTeam scrumTeam=new ScrumTeam("PO","BA","SM",14);
        System.out.println(scrumTeam);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTester(tester1);
        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);


    }
}
