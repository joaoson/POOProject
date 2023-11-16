package labour_entities;

import java.util.Calendar;

public class Manager extends Employee{

    public Manager(String name, String password, String login, String dateOfBirth, String gender) {
        super(name, password, login, dateOfBirth, gender);
    }

    @Override
    public String accessLevel() {
        return "Manager Access Level, creation and viewing of employees allowed";
    }
}
