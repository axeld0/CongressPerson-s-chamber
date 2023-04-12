public class Senator extends CongressPerson {

    public Senator(int ID, String name, String birthday, String state, String politicalParty)
    {
        super(ID, name, birthday, state, politicalParty);
    }

    @Override
    public String getChamber()
    {
        return "Chamber of Senators";
    }
}
