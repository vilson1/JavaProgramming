package day30;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();

        employee1.setInfo("John",2237,'M',"Developer", 100000,true);
        employee2.setInfo("Anna", 2287,'F',"QA",85000,true);
        employee3.setInfo("David",2256,'M',"QA",45000,false);
        employee4.setInfo("Lina",2290,'F',"Manager",110000,true);
        employee5.setInfo("Kevin",2298,'M',"Senior QA",110000,true);

        Employee[] employees={employee1,employee2,employee3,employee4,employee5};

        int countFullTime=0;
        int countPartTime=0;
        double maxSalary=employee1.salary;
        double minSalary=employee1.salary;

        for (Employee employee : employees) {
            if (employee.isFullTime==true)
                countFullTime++;
            else
                countPartTime++;

            if (employee.salary>maxSalary)
                maxSalary=employee.salary;
            if (employee.salary<minSalary)
                minSalary=employee.salary;
        }
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);

        System.out.println("minSalary = " + minSalary);
        System.out.println("maxSalary = " + maxSalary);





    }
}
