

class TV{
   int channel;
    int volumelevel;
    boolean on;
   public  TV(){
       channel=1;
       volumelevel=6;
   
   }
     public void turnon(){
     on =true;
     }
     public void turnoff(){
     on =false;
     }
       
    
      public void setchannel(int newchannel){
  if (on==true){
          this.channel = newchannel;
  }
      }
         public void setvolume(int newvolumelevel){
   if (on==true){
             this.volumelevel = newvolumelevel;
   }
   }
           public void channelup (){
        if (on==true){       
   channel = channel+1;
   if(channel ==121){
   channel=1;
   }}
   }
            public void channeldown (){
  if (on==true){
                channel = channel-1;
    if(channel ==0){
   channel=120;
   }}
   }
    public void volumeup (){
   if (on==true){
        volumelevel = volumelevel+1;
   if(volumelevel>7){
   volumelevel =7;
   }}
    }
      public void volumedown (){
  if (on==true){
          volumelevel = volumelevel-1;
    if(volumelevel<1){
   volumelevel =1;
   }
  }
   }
   
    public void disply(){
    if (on==true){
        System.out.println(channel+" "+volumelevel+" ");
   
    }else{
    System.out.println("Tv is off");
    } 
        
            
   
        }
}
   
   
public class Television {

   
   
    public static void main(String[] args) {
       
       TV tv1 =new TV();
     tv1.turnon();
     System.out.println("Tv is off");
      
     
     
   
       
    }
    
}
