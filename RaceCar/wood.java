import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class wood extends parent
{
    int speed = 5;
    public void act() //mtd
    {
       wood a = new wood();
       Actor i = getOneIntersectingObject(wood.class);
        
       move(speed);
       checkdouble(i);
       end();
    }    
}
