import java.util.Scanner;

public class Main {

    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        CongressPerson[] p = new CongressPerson[2];

        p[0] = new Representative(12456846, "Charles Manson", "12/6/63", "Utah", "Conservative");
        p[1]= new Senator (4654785, "Mary Jane Watson", "4/5/1965", "California", "Republican");


        /**
         * prints out in which chamber works every congressperson in the array.
         */
        for(int i = 0; i < p.length ; i++)
        {
            System.out.println(p[i].getName().toString()+"-"+ p[i].getChamber().toString());
        }




    }
}