
import java.util.*;

public class DogMasterTester {
    public static void main (String args[]) {
        Dog dog1 = new Dog ("Spot", 1, Dog.Breed.GERMAN_SHEPHERD, 123);
        Dog dog2 = new Dog ("Fido", 2, Dog.Breed.PITBULL, 693);
        Dog dog3 = new Dog ("Rover", 4, Dog.Breed.BORDER_COLLIE, 523);
        
        boolean broken = false;
        
        if(dog1.convertToHumanYears() != 13) { broken=true; }
        if(dog1.convertToHumanYearsExact() != 13.0) { broken=true; }
        if(dog1.convertToHumanYearsRounded() != 13) { broken=true; }
        if(dog1.computeDogIDCheck() != 'L') { broken=true; }           //L
        
        if(dog2.convertToHumanYears() != 18) { broken=true; }         
        if(dog2.convertToHumanYearsExact() != 18.0) { broken=true; }
        if(dog2.convertToHumanYearsRounded() != 18) {broken = true;}
        if(dog2.computeDogIDCheck() !=  'N'){broken = true;}
        if(dog3.convertToHumanYears() != 32) {broken = true;}
        if(dog3.convertToHumanYearsExact() != 32.0) {broken = true;}
        if(dog3.convertToHumanYearsRounded() != 32) {broken = true;}
        if(dog3.computeDogIDCheck() != 'F'){broken = true;}
        System.out.println(broken);
    }
}