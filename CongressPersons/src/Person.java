import java.util.Objects;

public abstract class Person {

    private int ID;
    private String name;
    private String birthday;

    public Person() {
        ID = 0;
        name = "";
        birthday = "";
    }

    public Person(int ID, String name, String birthday) {
        this.ID = ID;
        this.name = name;
        this.birthday = birthday;
    }

    //setters

    public void setID(int id) {
        ID = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    //getters
    public int getID(){return ID;}
    public String getName(){return name;}
    public String getBirthday(){return birthday;}

    @Override
    public String toString() {
        return  "ID=" + ID +
                ", name='" + name + '\'' +
                ", birthday='" + birthday ;
    }

    @Override
    public boolean equals (Object obj)
    {
        boolean ans = false;

        if(obj!= null)
        {
            if(obj instanceof Person)
            {
                Person aux = (Person) obj;

                if(getName().equals(aux.getID()))
                {
                    ans = true;
                }
            }
        }
        return ans;
    }

}
