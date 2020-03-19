// BankingSyestem most Updated version
// sir sy bug remove krwa kr update krna hai

package javaapplication1;
import java.util.ArrayList;
import java.util.Scanner;
import javaapplication1.BankAccount.CheckingAccount.SavingAccount;



public class JavaApplication1 

{


 public static void main(String[] args) 
 {
 String Name, AccountNumber;
        double Balance;
        
        Scanner sc = new Scanner(System.in);
     
         
       {ArrayList<BankAccount> Customer = new ArrayList();
       for (int i = 0; i < 10; i++) {
System.out.println("press 1 for creation of Saving Account");
System.out.println("press 2 for creation of Cheching Account");
System.out.println("press 3 for interest posting  ");
System.out.println("press 4 for Account information ");

int UserInput = sc.nextInt();
        
            
        
       
      
         if(UserInput==1){
           System.out.print("Enter Name: ");
           Name = sc.next();
           System.out.print("Enter Account number: ");
           AccountNumber= sc.next();
           System.out.print("Enter Balance: ");
           Balance=sc.nextDouble();
           Customer.add(new SavingAccount(Name, AccountNumber, Balance));
           
       
       }
       if (UserInput==2)
       {
           System.out.print("Enter Name: ");
           Name = sc.next();
           System.out.print("Enter Account number: ");
           AccountNumber= sc.next();
           System.out.print("Enter Balance: ");
           Balance=sc.nextDouble();
           Customer.add(new CheckingAccount(Name, AccountNumber, Balance));
           
           }
      if(UserInput==3){
       for(BankAccount obj:Customer)
       {
      if(obj instanceof SavingAccount){
          ((SavingAccount) obj).PostInterest(1.2);
      
      System.out.println(obj);
      
      
      }
          
          
          
      }      
  
    
      }
    if(UserInput==4){
    System.out.println(Customer);
    
    
    }
      }
        }
    
    }
}


class BankAccount
{
    private double Balance;
    private String Owner;
    private String AccountNumber;
    
   public BankAccount(String Name,double Amount,String AccountNumber)
   {this .Owner = Name;
   this.Balance = Amount;
   this.AccountNumber=AccountNumber;
   
   }
    public BankAccount(BankAccount OldAccount,double Amount)
   { this .Owner = OldAccount.Owner;
   this.Balance = OldAccount.Balance + Amount;
   this.AccountNumber=OldAccount.AccountNumber;

   }
    public void Deposit(double Amount)
    {
        this.Balance =Balance+Amount; 
    }
     
     public boolean WithDraw(Double Amount)
    {
      this.Balance=Balance-Amount;
     return true;
     }
      public double GetBalance()
    { 
return this.Balance;
    }
       public String GetOwner()
    { return this.Owner;
    }
       public String GetAccountNumber()
    { return this.AccountNumber;
    }
          public void SetBalance(double Amount)
    { this.Balance= Amount;
    }
        public void SetAccountNoumber(String NewAccountNumber)
    { this.AccountNumber = NewAccountNumber;
    }
        
     @Override
 public String toString()
 {
     return Balance +" "+ Owner +" "+ AccountNumber;
 }
 
class CheckingAccount extends BankAccount
{
    private Double Fee;
    public CheckingAccount (String Name,Double Amount,String AccountNumber)
    {
        
 super(Name,Amount,AccountNumber);          
    }
    public boolean WithDraw(Double Amount)
    {
       if(GetBalance()>=Amount+Fee){
return true;
}else{
return false;
}
    }
    
     @Override
 public String toString()
 {
     return Balance +" "+ Owner +" "+ AccountNumber;
 }
     
class SavingAccount extends BankAccount
{
    private Double Rate;
private int SavingNumber;
    public SavingAccount (String Name,Double Amount,String AccountNumber)
    {
 super(Name,Amount,AccountNumber);          
         
    }
    public SavingAccount (SavingAccount OldAccount,Double Amount)
    {
        super(OldAccount.GetOwner(),OldAccount.GetBalance(),OldAccount.GetAccountNumber());

    }
    public void PostInterset(Double Amount)
    {
        Deposit (GetBalance()*Rate);
 }
     
     @Override
 public String toString()
 {
     return Balance +" "+ Owner +" "+ AccountNumber;
 }

}   
   
}
}


