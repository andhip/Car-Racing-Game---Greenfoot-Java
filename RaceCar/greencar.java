import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class greencar extends parent
{
    int speed = 5; 
    public void act() //mtd
    {
        
        greencar a = new greencar();
        Actor i = getOneIntersectingObject(bluecar.class);
        
       move(speed);
       checkdouble(i);
       end(); //object atas&bawah menghilang
    }    
}
