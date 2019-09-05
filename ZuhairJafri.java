import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * 
 * Zuhair Jafri 
 * @version (a version number or a date)
 */
public class ZuhairJafri extends Student implements SpecialInterestOrHobby
{

    /*
     * Constructor for the ZuhairJafri class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */

    private int x = 0;
    public ZuhairJafri(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
    }
    /*
     * Default constructor, if you don't pass in a name and seating location
     */
    public ZuhairJafri() {
        firstName="Zuhair";
        lastName="Jafri";
        myRow=4;
        mySeat=5;
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
    }
    
     /**
     * Act - do whatever the ZuhairJafri actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);
            myHobby("I like to mess around, play games\nand waste time on my laptop.");
            LearnedSoFar("So far, I've learned a lot in this class! For example,\nI learned about what one can do with Java, Github \nand Greenfoot.");
            // Call the sitDown() method to move back  to your seat
            DriftyBoiz();  // Zuhair Jafri's special method... Please write one of your own. You can use this, but please modify it and be creative.
          
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("Hey!\nMy name is " + firstName + " " + lastName);
    }
    public void DriftyBoiz(){
        setImage("lightningmcqueen.jpg");
        Greenfoot.playSound("90's.mp3");
        setLocation(0,0);
        Greenfoot.delay(10);
        // move right
        for (int i=1;i<=9;i++){
            setLocation(i,0);
            setRotation(x);
            x = x + 20;
            Greenfoot.delay(2);
        }
        // move back
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            setRotation(x);
            x = x + 5;
            Greenfoot.delay(2);
        }      
        // move left
        for (int i=9;i>=0;i--){
            setLocation(i,5);
            setRotation(x);
            x = x + 5;
            Greenfoot.delay(2);
        }      
            // move right again
        setLocation(4,2);
        Greenfoot.delay(5);
        setRotation(0);
        for (int i=1;i<=150;i++){
            setRotation(x);
            x = x - 10;
            Greenfoot.delay(1);
        }
        for (int i=1;i<=5;i++){
            setLocation(getX()+1, getY());
            Greenfoot.delay(3);
            setLocation(getX()-1, getY());
            Greenfoot.delay(2);
        }
        setRotation(0);
        setLocation(4,2);
        for (int i=1;i<=65;i++){
            setRotation(x);
            x = x + 5;
            Greenfoot.delay(2);
        }
           setRotation(0);
           setImage ("dio.jpg");
           Greenfoot.delay(3);
           setImage("zuhairjafri.jpg");
           Greenfoot.delay(20);
           sitDown();
    }
     public void myHobby(String s) {
         System.out.println(s);
}
    public void LearnedSoFar(String n){
    System.out.println(n);
    }
}