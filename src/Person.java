public class Person {
    public String firstName;
    public String lastName;
    public int ID;
    public String title;
    public int YOB;

    public String fullName;


    public Person(String firstName, String lastName, String ID, String title, int YOB, String fullName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = 0;
        this.title = title;
        this.YOB = YOB;
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String fullName() {
        return fullName();
    }

    public String getFullName() {return fullName;}


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() { return ID;}

    public void setID(String ID) {
        this.ID = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", YOB=" + YOB +
                '}';
    }
    public String toCSVRecord() {
        return this.ID + ", " + this.firstName + "," + this.lastName + "," + YOB;
    }


}

