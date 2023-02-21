import java.util.*;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }

    public String[] getPlanets(String galaxy){
        //String [] galaxy = new String[3];
        if (galaxy.equals("Miaru")) {
            return new String[]{
                    "Maux", "Reux", "Piax"
            };
        };
        if (galaxy.equals("DangerBanger")) {
            return new String[] {
                    "Fobius", "Demius"
            };
        } ;

        if (galaxy.equals("Milkyway")) {
            return new String[] {
                    "Earth", "Mars", "Jupiter"
            } ;
        }

        else {
            return new String[0];
        }
    }
    public static void main (String[]args){
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
    }
}
