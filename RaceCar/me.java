import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class me extends Actor
{
    int score = 0;
    public void act() //mtd
    {
        getWorld().showText("Score : " + score, 70, 30); //menampilkan text 
        checkKey();
        end();
        addscore();
    }    
    
    public void checkKey(){
        if(Greenfoot.isKeyDown("left")){
            if(getX()>= 210){
                setLocation(getX() -3, getY());
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<= 398) {
                setLocation(getX() +3, getY());
            }
        }
        
        if(Greenfoot.isKeyDown("up")){
                setLocation(getX(), getY() -4);
        }
        if(Greenfoot.isKeyDown("down")){
                setLocation(getX(), getY() +4);
        }
    }
    
    public void end(){
        if(isTouching(bluecar.class)||isTouching(greencar.class)){
            getWorld().showText("GAME OVER \n Score : " + score, 300, 300);
            Greenfoot.stop();
        }
    } //gameover
    
    public void addscore(){
        if(isTouching(coin.class)){
            score = score + 20;
            removeTouching(coin.class);
        }
    }
}
