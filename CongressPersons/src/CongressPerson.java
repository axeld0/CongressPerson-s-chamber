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


    /**
     * Gives the congressperson's info to the user.
     * @return
     */
    @Override
    public String toString()
    {
        return super.toString() + " Province = "+ state +"Party = "+politicalParty +"}";
    }

    /**
     * abstract method that gets the chamber in witch the congressperson works.
     */
    public abstract String getChamber ();
}
