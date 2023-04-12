public class Representative extends CongressPerson{

    String chamber = "Chamber of Representatives";
    
    public Representative(int ID, String name, String birthday, String state, String politicalParty) {
        super(ID, name, birthday, state, politicalParty);
    }

    @Override
    public String getChamber()
    {
        return chamber;
    }

}
