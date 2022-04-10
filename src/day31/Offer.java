package day31;

public class Offer {
    public String location;
    public String companyName;
    public String JobTitle;
    public double salary;
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean isWFH;
    public boolean isFullTime;


    public void setInfo(String location, String companyName, String jobTitle, double salary,
                 boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        JobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
