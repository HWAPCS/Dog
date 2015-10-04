import java.util.*;

public class DogTester {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please enter the name of the first dog: ");
        String name = s.nextLine();
        System.out.print("Please enter the age of "+name+": ");
        int age = s.nextInt();
        System.out.print("Please enter the ID of "+name+": ");
        int ID = s.nextInt();
        Dog dog1 = new Dog(name, age, Dog.Breed.BORDER_COLLIE, ID);
        
        System.out.print("Please enter the name of the second dog: ");
        s.nextLine();
        name = s.nextLine();
        System.out.print("Please enter the age of "+name+": ");
        age = s.nextInt();
        System.out.print("Please enter the ID of "+name+": ");
        ID = s.nextInt();
        Dog dog2 = new Dog(name, age, Dog.Breed.BORDER_COLLIE, ID);
        
        System.out.print("Please enter the name of the third dog: ");
        s.nextLine();
        name = s.nextLine();
        System.out.print("Please enter the age of "+name+": ");
        age = s.nextInt();
        System.out.print("Please enter the ID of "+name+": ");
        ID = s.nextInt();
        Dog dog3 = new Dog(name, age, Dog.Breed.BORDER_COLLIE, ID);
        
        System.out.println(dog1.getName()+":");
        System.out.println(dog1.convertToHumanYears());
        System.out.println(dog1.convertToHumanYearsExact());
        System.out.println(dog1.convertToHumanYearsRounded());
        System.out.println(dog1.computeDogIDCheck());
        System.out.println(dog1.toString());
        System.out.println();
        System.out.println(dog2.getName()+":");
        System.out.println(dog2.convertToHumanYears());
        System.out.println(dog2.convertToHumanYearsExact());
        System.out.println(dog1.convertToHumanYearsRounded());
        System.out.println(dog2.computeDogIDCheck());
        System.out.println(dog1.toString());
        System.out.println();
        System.out.println(dog3.getName()+":");
        System.out.println(dog3.convertToHumanYears());
        System.out.println(dog3.convertToHumanYearsExact());
        System.out.println(dog1.convertToHumanYearsRounded());
        System.out.println(dog3.computeDogIDCheck());
    }
    
    //Old main class
    public static void oldMain (String args[]) {
        Dog dog1 = new Dog ("Spot", 1, Dog.Breed.GERMAN_SHEPHERD, 123);
        Dog dog2 = new Dog ("Fido", 2, Dog.Breed.PITBULL, 693);
        Dog dog3 = new Dog ("Rover", 4, Dog.Breed.BORDER_COLLIE, 523);
        
        System.out.println(dog1.convertToHumanYears());
        System.out.println(dog1.convertToHumanYearsExact());
        System.out.println(dog1.convertToHumanYearsRounded());
        System.out.println(dog1.computeDogIDCheck());
        
        System.out.println(dog2.convertToHumanYears());
        System.out.println(dog2.convertToHumanYearsExact());
        System.out.println(dog1.convertToHumanYearsRounded());
        System.out.println(dog2.computeDogIDCheck());
        
        System.out.print(dog3.convertToHumanYears());
        System.out.print(dog3.convertToHumanYearsExact());
        System.out.print(dog1.convertToHumanYearsRounded());
        System.out.print(dog3.computeDogIDCheck());
    }
}