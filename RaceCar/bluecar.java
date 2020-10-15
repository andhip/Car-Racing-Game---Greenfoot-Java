import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class bluecar extends parent
{
    int speed = 3; 
    public void act() //mtd
    {
        
        bluecar a = new bluecar();
        Actor i = getOneIntersectingObject(bluecar.class);
        
       move(speed);
       checkdouble(i);
       end();
    }    
}
