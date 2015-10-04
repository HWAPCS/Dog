import java.math.*;

/**
 * The dog class constructs a dog and can calculate its age in human years and validate its dog tag.
 * 
 * I have neither given nor recived unauthorized aid on this assignment.
 * @author Jonathan Damico
 * @since 2015.9.25
 * @version 2015.9.2015
 */
public class Dog {
    
    enum Breed { GERMAN_SHEPHERD, PITBULL, BORDER_COLLIE }
    
    private String name;
    private int age;
    public static final int NUMBER_OF_LEGS = 4;
    private Breed breed;
    private int dogID;
    private char dogIDCheck;
    private String dogTag;
    
    /**
     * Constructs a dog
     * @param name The name of the dog
     * @param age The age of the dog in dog years
     * @param breed The breed of the dog
     * @param dogID the ID number of the dog
     */
    public Dog (String name, int age, Breed breed, int dogID) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        if(Integer.toString(dogID).length()!=3)
            throw new IndexOutOfBoundsException();        
        else {
            this.dogID = dogID;
            this.dogIDCheck = computeDogIDCheck();
            this.dogTag = "" + this.dogID + this.dogIDCheck;
        }
    }
    
    /**
     * @return the name of the dog
     */
    public String getName () { return(name); }
    
    /**
     * @return the age of the dog in dog years
     */
    public int getAge () { return(age); }
    
    /**
     * @return the breed of the dog
     */
    public Breed getBreed() { return(breed); }
    
    /**
     * @return the dog ID of the dog
     */
    public int getDogID() { return(dogID); }
    
    /**
     * @return the dog's full dog tag
     */
    public String getDogTag() { return(dogTag); }
    
    /**
     * Sets the name of the dog
     * @param name The name of the dog
     */
    public void setName (String name) { this.name = name; }
    
    /**
     * Sets the age of the dog
     * @param age The age of the dog
     */
    public void setAge (int age) { this.age = age; }
    
    /**
     * Sets the breed of the dog
     * @param breed The breed of the dog
     */
    public void setBreed (Breed breed) { this.breed = breed; }
    
    /**
     * Sets the dog ID of the dog and automatically creates a dog tag
     * @param dogID the dog's ID
     */
    public void setDogID (int dogID) { 
        this.dogID = dogID; 
        this.dogIDCheck = computeDogIDCheck();
        this.dogTag = "" + this.dogID + this.dogIDCheck;
    }
    
    /**
     * Converts dog to a string
     * @return information about the dog as a string
     */
    public String toString () {
        return(name + " is " + age +" years old. It's dog tag reads "+dogTag);
    }
    
    /**
     * Converts the dog's age into human years
     * @return the dog's age in human years
     */
    public int convertToHumanYears () {
        if(age==1)
            return(13);
        else if (this.breed == Breed.BORDER_COLLIE) 
            return(13+(age-1)*19/3);
        else
            return(13+(age-1)*16/3);
    }
    
    /**
     * Converts the dog's age into human years and rounds the number
     * @return the dog's age in human years rounded
     */
    public int convertToHumanYearsRounded () {
        if(age==1)
            return(13);
        else if (this.breed == Breed.BORDER_COLLIE) 
            return(Math.round(13+(age-1)*19/3));
        else
            return(Math.round(13+(age-1)*16/3));
    }
    
    /**
     * Converts the dog's age into human years with double precision
     * @return the dog's age in human years with double precision
     */
    public double convertToHumanYearsExact () {
        if(age==1)
            return(13);
        else if (this.breed == Breed.BORDER_COLLIE) 
            return(13+(age-1)*19/3);
        else
            return(13+(age-1)*16/3);
    }
    
    /**
     * Calculates the final letter to go on the dog tag.
     * @return a char to affix to the end of the dog ID to create a dog tag.
     */
    public char computeDogIDCheck () {
        if(Integer.toString(dogID).length()!=3)
            throw new IndexOutOfBoundsException();
        int sumOfElements = 0;
        for(int i = 0; i <= 2 ; i++)
            sumOfElements+=Integer.parseInt(Integer.toString(dogID).substring(i,i+1),10);
        return((char) (70+sumOfElements%10));
    }
    
    /**
     * Checks that a dog tag is valid
     * @param dogTag the dog tag to be checked
     * @return true if the dog tag is a valid dog tag
     */
    public static boolean checkDogTag (String dogTag) {
        if(dogTag.length()!=4)
            throw new IndexOutOfBoundsException();
        int sumOfElements = 0;
        for(int i = 0; i <= 2 ; i++)
            sumOfElements+=Integer.parseInt(dogTag.substring(i,i+1),10);
        char dogID = (char) (70+sumOfElements%10);
        if(dogTag.equals(dogTag.substring(0,3)+dogID))
            return(true);
        else
            return(false);
    }
}