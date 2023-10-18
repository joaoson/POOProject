package labour_entities;

import java.util.Calendar;

public class Worker extends Employee{
    public Worker(String name, String password, String login, Calendar dateOfBirth, String gender) {
        super(name, password, login, dateOfBirth, gender);
    }
}
