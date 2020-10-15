import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class parent extends Actor
{
   
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void end(){ //mtd
        if(getY() >= 599||getY() <=0){
            getWorld().removeObject(this); //menghilangkan obj mobil
        }
    }
    
    public void checkdouble(Actor i){
        if( i != null) {
            getWorld().removeObject(i); //agar obj tidak menumpuk
        }
    }
    
    public void move(int speed){
        setLocation(getX(),getY() + speed); //pergerkan/kcepatan
    }
}
