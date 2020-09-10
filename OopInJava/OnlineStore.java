

import java.util.ArrayList;
import java.util.Scanner;

class Inventory 
{
      ArrayList<Item> item = new ArrayList<Item>();
      ArrayList<Order> order = new ArrayList<Order>();

   public void addInventory(Item items)
   {
       item.add(items);
   }
   public String getInventory()
   {
       for(Item items:item)
       return items.toString();
          
       return null;
   }
   public void addorder(Order orders)
   {order.add(orders);
   }
   public String getOrder()
   {
       for (Order orders: order)
       return orders.toString();
          return null;
   }
   public String toString()
   {
        return item.toString() + order.toString();
       
   }
   
}
class Order
{
    String costomername; double Totalorders;
   ArrayList<Item> orderlist = new ArrayList<Item>();
   public void addItem(Item items)
   {
       orderlist.add(items);
       
   }
   public void removeItem(Item items)
   {
       orderlist.remove(items);
   }
   public String toString()
   {
       return "Name: "+costomername+"  Totalprice: "+ Totalorders;
   }
}

class Item extends Inventory
{
    public String name;
    public double price;
    public int quantity;
   Item ()
   {
       
   }
    public  Item(String name,double price,int quantity)
   {
       this.name=name;
       this.price=price;
       this.quantity=quantity;
   }
       public void setPrice()
       {
           System.out.println(price);   
       }
   public double getPrice()
   {
       return this.price;
   }
    public void setQuantity()
       {
          System.out.println(quantity);
       }
   public double getQuantity()
   {
       return this.quantity;
   }
    @Override
   public String toString()
   {
   return "Item: "+name+"  price: "+ price +"  quantity: " + quantity;
   }
}
   
class Cloth extends Item
{
    public  Cloth(String name,double price,int quantity)
    {
         this.name=name;
       this.price=price;
       this.quantity=quantity;
    }
}

class Cosmetic extends Item
{
    public  Cosmetic(String name,double price,int quantity)
    {
         this.name=name;
       this.price=price;
       this.quantity=quantity;
    }
}
class Electronic extends Item
{
    public  Electronic(String name,double price,int quantity)
    {
         this.name=name;
       this.price=price;
       this.quantity=quantity;
    }
}
public class OnlineStore{
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name,decision; 
       int  quantity , number,option;
    double price;  
    Inventory mainInventory= new Inventory();
    Order firstOrder =new Order();
do{
    System.out.println("--------------");
         System.out.println("Welcome To store");
         System.out.println(" make your Seclection");
         System.out.println("1 Add inventory");
       System.out.println("2 Add Order");
        System.out.println("3 show inventory");
         System.out.println("4 show order");
     System.out.println("5 show Details");
      System.out.println("6 exit system");
       number =in.nextInt();
    
      switch (number){
          case 1:
          {
     do{
          System.out.println("you can add the following");
          System.out.println("1 Cloths");
       System.out.println("2 Cosmetics");
        System.out.println("3 electronics");
         option =in.nextInt();
      switch (option){
          case 1:{    
          System.out.println("clothes");
          System.out.println("Entre Name");
         name =in.next();
          System.out.println("Entre QUANTITY");
         quantity =in.nextInt();
         System.out.println("Entre Price");
         price =in.nextDouble();
          Cloth cloths1 = new Cloth(name,price,quantity);
         mainInventory.addInventory(cloths1);
        break;
      }      
   case 2:{
          System.out.println("Cosmetics");
          System.out.println("Entre Name");
         name =in.next();
          System.out.println("Entre QUANTITY");
         quantity =in.nextInt();
         System.out.println("Entre Price");
         price =in.nextDouble();
          Cosmetic cosmetic1 = new Cosmetic(name,price,quantity);
         mainInventory.addInventory(cosmetic1);
   break;   
   }      
   case 3:{
          System.out.println("Electronis");
          System.out.println("Entre Name");
         name =in.next();
          System.out.println("Entre QUANTITY");
         quantity =in.nextInt();
         System.out.println("Entre Price");
         price =in.nextDouble();
         Electronic electronic1 = new Electronic(name,price,quantity);
         mainInventory.addInventory(electronic1);
   break;   
   }
   }
     System.out.println("Do you want to add more inventory yes or no");
          decision = in.next();
      decision = decision.toUpperCase();
      
      }while("YES".equals(decision));
          break;
          }
     case 2:{

        do{
             System.out.println("you can add order from this");
             System.out.println( mainInventory.toString());
         System.out.println( mainInventory.getInventory().indexOf(item)+ "" +mainInventory.getInventory());
      System.out.println("Entre Number");
        int index =in.nextInt();
           System.out.println("Entre QUANTITY");
         quantity =in.nextInt();
       // firstOrder.addItem( mainInventory.item[index]);
          // add more order if  yes loop it
          System.out.println("Do you want to add more oder yes or no");
          decision = in.next();
      decision = decision.toUpperCase();
     }while("YES".equals(decision));
        break;}
     case 3:{
          System.out.println(mainInventory.getInventory());
          break;
     }
     case 4:
     {  System.out.println( mainInventory.getOrder());
         break;
     }case 5:
   {System.out.println( mainInventory.toString());
       System.out.println( mainInventory.getOrder());
        System.out.println(firstOrder.toString());
    break;}
   default:
   {  
      System.out.println(mainInventory.getInventory());
      System.out.println( mainInventory.toString());
       System.out.println( mainInventory.getOrder());
        System.out.println(firstOrder.toString());

            System.out.println("Allah hafiz");
                break;
                
                
 }
      
}
                
}while(number<=5);
}
}