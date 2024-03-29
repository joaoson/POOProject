package labour_entities;

public class ChiefExecutiveOfficer extends Manager{
    public ChiefExecutiveOfficer(String name, String password, String login, String dateOfBirth, String gender) {
        super(name, password, login, dateOfBirth, gender);
    }

    @Override
    public String accessLevel() {
        return "CEO Access Level, all functions within the app are allowed";
    }

    @Override
    public String getPosition(){
        return "CEO";
    }
}
