package labour_entities;

import java.util.Calendar;

public abstract class Employee {

    protected String name;
    protected String password;
    protected String login;
    protected Calendar dateOfBirth;
    protected String gender;

    public Employee(String name, String password, String login, Calendar dateOfBirth, String gender) {
        this.name = name;
        this.password = password;
        this.login = login;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
}
