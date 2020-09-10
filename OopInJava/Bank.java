
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *

 */
public class Bank{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Bankaccount [] arr = new Bankaccount [10];
         arr[0] = new Bankaccount ("Salim",1923,"B125");
         arr[1] = new savingaccount ("Salima","t1923",125);
         arr[2]= new savingaccount((savingaccount)arr[1]);
         for (int i = 0; i <arr.length; i++) 
         {
           System.out.println(arr[i]);
        }
            
         
         
       
      
  
    
    
    
    
    
    
    }
}
 class Bankaccount
 {
     private double balance;
     private String owner;
     private String accountno;
    //Bankaccount BA =new Bankaccount(Bankaccount oldaccount,double amount);
     public Bankaccount(String name,double amount,String accountnum)
     {
     this.owner=name;
     this.balance = amount;
     this.accountno=accountnum;
     }
 public Bankaccount(Bankaccount oldaccount ,double amount)
  {
      this.owner=oldaccount.owner;
      this.balance =oldaccount.balance+amount;
      this.accountno= oldaccount.accountno; 
 }
 public void deposit(double amount)
 {
 this.balance=balance+amount;
 }
 public boolean withdraw(double amount){
 
  this.balance=balance-amount;
return true;
 }
 public double getbalance(){
 return this.balance;
 }
 public String getowner(){
 return this.owner;
 }
 public String getaccountno(){
 return this.accountno;
 }
 public void setbalance(double amount){
 this.balance=amount;
 }
 public void setaccountnumber(String newaccountnumber){
 this.accountno=newaccountnumber;
 }
 
     @Override
 public String toString()
 {
     return balance +" "+ owner +" "+ accountno;
 }
 }
 class checkingaccount extends Bankaccount{
 
 private double fee;
 public checkingaccount(String name,double amount,String accountno){
         
super(name,amount, accountno);             
         }
 public boolean withdraw(double amount){
if(getbalance()>=amount+fee){
return true;
}else{
return false;
}
     
 }
 
 }   
    class savingaccount extends Bankaccount{
 
 private double rate;
 private int savingno;
 public savingaccount(String name,String accountno ,double amount)
 {
super(name,amount,accountno);
         
             
 }
 public savingaccount(savingaccount oldaccount){
     
super(oldaccount.getowner(),oldaccount.getbalance(),oldaccount.getaccountno());

 }
 public void postinterest(){
 deposit (getbalance()*rate);
 }
     @Override
 public String toString()
 {
     return  this.getowner()+" "+this.getbalance() +" "+ this.getaccountno();
 }
 
 }    
    
    
    
    
    
    






