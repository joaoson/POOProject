package labour_entities;

import java.util.Calendar;

public class Worker extends Employee{
    public Worker(String name, String password, String login, String dateOfBirth, String gender) {
        super(name, password, login, dateOfBirth, gender);
    }

    @Override
    public String accessLevel() {
        return "Worker Access Level, viewing of orders allowed";
    }

    @Override
    public String getPosition(){
        return "Worker";
    }
}
