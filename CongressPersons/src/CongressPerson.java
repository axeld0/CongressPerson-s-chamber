public abstract class CongressPerson extends Person{

    private String state;
    private String politicalParty;


    /**
     * constructors
     */
    public CongressPerson ()
    {
        state = "";
        politicalParty = "";
    }

    public CongressPerson(int ID, String name, String birthday, String state, String politicalParty) {
        super(ID, name, birthday);
        this.state = state;
        this.politicalParty = politicalParty;
    }

    /**
     * getters and setters
     */

    public String getState(){return state;}
    public String getPoliticalParty(){return politicalParty;}

    public void setState(String state)
    {
        this.state = state;
    }
    public void setPoliticalParty (String politicalParty)
    {
        this.politicalParty = politicalParty;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Province = "+ state +"Party = "+politicalParty +"}";
    }

    public abstract String getChamber ();
}
