/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.*;
/**
 *
 * @autor
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x=0;
       int y=0;
        student[] std = new student[50];
        staff[] stf = new staff[50];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            
        
            System.out.println("enter 1 for student entry, enter 2 for staff entry ,3 for search student, 4 for staff search");
        
             int k = sc.nextInt();
             if(k==1){
                 System.out.println("enter number of students you want to enter");
                 int w = sc.nextInt();
                 for (int j = 0; j< w; j++) {
                     
                
             System.out.println("enter name");
             String name = sc.next();
              System.out.println("enter address");
             String address = sc.next();
             System.out.println("enter program");
              String program = sc.next();
              System.out.println("enter year");
              int year = sc.nextInt();
               System.out.println("enter fee");
             double fee = sc.nextInt();
              std [x]= new student(name,address,program,year,fee);
              x++;
                 }
                 
             }
                     
             if(k==2){
             
             System.out.println("enter number of staff you want to enter");
                 int v = sc.nextInt();
                 for (int j = 0; j< v; j++) {
                     
                
             System.out.println("enter name");
             String name = sc.next();
              System.out.println("enter address");
             String address = sc.next();
             System.out.println("enter school");
              String school = sc.next();
             
               System.out.println("enter pay");
             double pay = sc.nextInt();
              stf [y]= new staff(name,address,school,pay);
              y++;
                 }
             }
                 if(k==3){
                 System.out.println("enter name of student you want to search");
                 String n = sc.next();
                     for (int h = 0; h< x+1; h++) {
                         if(n==std[x].getname()){
                         System.out.println(std[x].toString());
                         break;
                         }
                     }
                 }
                 if(k==4){
                  System.out.println("enter name of staff you want to search");
                 String n = sc.next();
                     for (int g = 0; g< y+1; g++) {
                         if(n==stf[y].getname()){
                         System.out.println(stf[y]);
                         break;
                         }
                     }
                 }
             
             
             
        }
             
             
             
             
             
        
        }
       
        
        
    }
    
    
    class person{
    
    private String name,address;
    public person(String name, String address){
    this.name = name;
    this.address = address;
    
    }
    public String getname(){
    return this.name;
    }
    public String getaddress(){
    return this.address;
    }
    public void setaddress(String address){
    this.address = address;
    }
    public String toString(){
    return ("person:"+name+":"+"address:"+address+":");
    }
    }
    class student extends person{
    private String program;
    private int year;
    private double fee;
    
    public student(String name,String address,String program ,int year,double fee){
    super(name,address);
    this.program=program;
    this.year=year;
    this.fee=fee;
    
    }
    public String getprogram(){
        return this.program;
    }
    public void setprogram(String program){
        this.program=program;
        
        
    }
    public int getyear(){
        return this.year;
    }
    public void setyear(int year){
        this.year=year;
        
        
    }
     public double getfee(){
        return this.fee;
    }
      public void setfee(double fee){
        this.fee=fee;
        
        
    }
        public String toString(){
    return ("student" + super.toString()+"program:"+ program + ":year"+ year +"fee" +fee);
    }
    }
    class staff extends person{
      private String school;
      private double pay;
      public staff(String name,String address,String school,double pay){
      
          super(name,address);
          this.school = school;
          this.pay = pay;
      
      }
    public String getschool(){
        return this.school;
    }
    public double getpay(){
        return this.pay;
    }
     public void setschool(String school){
        this.school=school;
        
        
    }
      public void setpay(double pay){
        this.pay=pay;
        
        
    }
       public String toString(){
    return ("staff" + super.toString()+"school:"+ school + ":pay"+ pay);
    }
    
    
    }