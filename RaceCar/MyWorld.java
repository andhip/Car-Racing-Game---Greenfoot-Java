import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() //konst
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();

    }
    
    
    public void prepare(){ //mtd
        me me = new me(); //obj
        addObject(me, 307, 557);
    }
    
    public void act(){
     if(Greenfoot.getRandomNumber(100)<1){   
         addObject(new bluecar(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
        
     if(Greenfoot.getRandomNumber(200)<1){   
         addObject(new greencar(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
        
     if(Greenfoot.getRandomNumber(100)<2){   
         addObject(new wood(), Greenfoot.getRandomNumber(140), 0);
         addObject(new wood(), Greenfoot.getRandomNumber(170) + 460, 0);
        }
         
     if(Greenfoot.getRandomNumber(200)<1){   
         addObject(new coin(), Greenfoot.getRandomNumber(200) + 200, 0);
        }
    }
}
