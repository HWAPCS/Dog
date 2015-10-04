
import java.util.*;

public class DogMasterTester {
    public static void main (String args[]) {
        Dog dog1 = new Dog ("Spot", 1, Dog.Breed.GERMAN_SHEPHERD, 123);
        Dog dog2 = new Dog ("Fido", 2, Dog.Breed.PITBULL, 693);
        Dog dog3 = new Dog ("Rover", 4, Dog.Breed.BORDER_COLLIE, 523);
        
        boolean broken = false;
        
        System.out.println(dog1.convertToHumanYears());
        System.out.println(dog1.convertToHumanYearsExact());
        System.out.println(dog1.convertToHumanYearsRounded());
        System.out.println(dog1.computeDogIDCheck());
        
        System.out.println(dog2.convertToHumanYears());
        System.out.println(dog2.convertToHumanYearsExact());
        System.out.println(dog2.convertToHumanYearsRounded());
        System.out.println(dog2.computeDogIDCheck());
        
        System.out.println(dog3.convertToHumanYears());
        System.out.println(dog3.convertToHumanYearsExact());
        System.out.println(dog3.convertToHumanYearsRounded());
        System.out.println(dog3.computeDogIDCheck());
    }
}