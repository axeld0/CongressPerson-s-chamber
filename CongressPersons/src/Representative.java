public class Representative extends CongressPerson{

    String chamber = "Chamber of Representatives";

    //constructor
    public Representative(int ID, String name, String birthday, String state, String politicalParty) {
        super(ID, name, birthday, state, politicalParty);
    }


    /**
     * overrides congressPerson getChamber()
     * @return
     */
    @Override
    public String getChamber()
    {
        return chamber;
    }

}
