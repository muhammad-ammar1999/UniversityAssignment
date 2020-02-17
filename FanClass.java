package javaapplication6;
class fan{
     private int speed;
      int slow=1;
     int medium=2;
     int fast=3;
    private int radius;
    String color;
     boolean on;
     boolean off;
public fan(){
speed=slow; 
radius=5;  
color="blue";
}
public void turnon(){
   on=true; 
}
public void turnoff(){
   on=false; 
}
public void setspeed(int speed){
    if(on==true)
    {
        this.speed=speed;
    }
   
}
 public void setradius(int radius)
    {
        
    
        this.radius=radius;
    
    }
 public void setcolor(String color)
 {
    
   
        this.color=color;
    
 }  
 @Override
 public String toString()
 {
     if(on==true)
     return "fan is on:" +on+ " speed:"+ speed + " radius:"+ radius +" color:"+ color;
     else
         return"fan is off:" +off+ " radius:"+ radius +" color:"+ color;
 }
}

      
public class JavaApplication6 {

    
    public static void main(String[] args) {
        
        fan f1=new fan();
         fan f2=new fan();
        f1.turnon();
        f1.setcolor("yellow");
        f1.setradius(10);
        f1.setspeed(3);
        System.out.println(f1.toString());
        
        System.out.println(f2.toString());
    }
    
}