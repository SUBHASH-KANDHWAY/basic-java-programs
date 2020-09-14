

public class tuna{
    public void simplemessage(){
        system.out.println("this is simple class");
    }
}
class apples{
    public static void main(string[] args){
        tuna tunaobject = new tuna();
        tunaobject.simpleclass();


    }
}


public class tuna {
    public void simplemessage(string name){
        system.out.println("hello "+name);
    }
}

import java.util.Scanner;
class apples{
    public static void main(String[] args) {
        scanner input= new scanner (system.in);
        tuna tunaobject = new tuna();
        system.out.println("enter your name");
        String name=input.nextLine();
        tunaobject.simplemessage(name):
        
    }
}
********************************************************************************************
import java.util.Scanner;
class apples{
    public static void main(String[] args) {
        scanner input= new scanner (system.in);
        tuna tunaobject = new tuna();
        system.out.println("enter your first gf name");
        String temp=input.nextLine();
        tunaobject.setname(temp):
        tunaobject.saying();
        
    }
}

public class tuna {
    private string girlname;
    public void setname(string name){
        girlname=name;
    }
    public string getname(){
        return girlname;
    }
    public void saying (){
        system.out.priintf("your first gf was %s",getname);

    }
}
*************************************************************************************************

*constructors*


public class tuna{
    private string girlname;
    public tuna (string name){
        girlname=name;
    }

    public void setname(string name){
        girlname=name;
    }

    public string getname(){
        return girlname;
    }

    public void saying(){
        system.out.printf("your gf name id %s",getname);
    }
    
}


class apples{
    public static void name(string[] args) {
        tuna tunaobject =  new tuna("hi");
        tuna tunaobject2 =  new tuna("hello");
        tunaobject.saying();
        tunaobject2.saying();
    }
}
******************************************************************

import java.util.*;
class Apples{
    public static void name(string[] args) {
        scanner input = new scanner(system.in);
        int total =0;
        int grade;
        ing average;
        System.out.print("enter the limit");
        int n=input.nextInt();
        int counter=0;
        
        while (counter<n){
            grade=input.nextInt();
            total=grage+total;
            counter++;
        }
        average=total/n;
        ststem.out.println("your averag is "+ average);
    }
}

********************************************************************abstract
class apples{
    public static void main(string[] args){
        double ammount;
        double principal = 1000;
        double rate = .01;

        for ( int day=1; day<=20; day++){
            ammount= principal*math.pow(1 + rate , day);
            system.out.println(day + " " + ammount);
        }
        }
    }

    ****************************************************************abstract

import java.util.random;

class apples{
    public static void main (string[] args){
        random dice = new random();
        int number;
        
        for (int counter =0 ;counter<= 12;cointer++)[
            number=1+dice.nextInt(6);
            system.out.println(number + " ");

        ]
    }
}
**********************************************************abstract
class apples{
    public static void main (string[] args){
        int subhash[]={2,3,4,5,6,7};
        system.out.println(sybhash[2]);
    }
}

****************************************************abstract
class apples{
    public static void main (string[] args){
        system.out.println("Insex\tValue");
        int subhash[]={2,3,4,5,6,7};

        for (int counter=0; counter < subhash.length;counter++){
            system.out.println(counter + "\t" + subhash(counter));
        }
    }

        }


*****************************************************abstract


class Apple {
    public static void main ( string[] args){
        system.out.println("Insex\tValue");
        int subhash[]={2,3,4,5,6,7};
        int sum=0;
        for (int counter=0; counter < subhash.length;counter++){
            system.out.println(counter + "\t" + subhash(counter));
            sum =sum+subhash[counter];
        }
    }

        }


************************************************************abstract

//ARRAY ELELEMENT AS COUNTEER

import java.util.random;

class apples{
    public static void main (string[] args){
        random dice = new random();
        int freq= new int[7];

        for (int roll=1;roll<=100;roll++){
            ++freq[1+rand.nextLine(6)];

        }
        for (int face=1; face<frq; face++){
        system.out.println(face + "\t" + freq(face));
    }
}

}

*********************************abstract

for(int x : subhash){
    total+ =x;
}


**************************************

class apples{
    public static void main(string [] args){
        int bucky[]= {1,2,3,4,5,6};
        change(bucky);
        
         for (int y : bucky){
             system.out.println(y);
         }

    public static void change(int x[]){

        for (int counter=0; counter<x.lenngth;counter++){
            x[counter]+=5;
        }
    }

    }


}

**********************************************abstract


public static void main(int x[][]{

   for (int row = 0; row <x; row ++){
       for (inr coloumn=0;coloumn<=x[row].length;coloumn++){
           system.out.println(x[row][coloumn]);
       }
   }

})



*****************************

public static int average(int...numbers){
    int total=0;
    for (int x:numbers){
        total+=x;

    }
    return total/numbers.length;
}


******************************

public class tuna{
    private int hour;
    private int min;
    private int sec;
     
    public void eetTime(int h,int m,int s){
       hour=((h>=0 && h<24) ? h: 0);
       min=((m>=0 && m<260) ? m: 0);
       sec= ((s>=0 && s<260) ? s: 0)
    } 

    public string toMilitary(){
        return String.format(" %02d:%02d:02%d, hour, min, sec");
    }
}




class apples{
    public static void name(string[] args) {
        
    
    tuna tunaobject= new tuna();
    system.out.println(tunaobject.toMilitary());
    tunaobject.setTime(24, 27 , 45);
}
}


***************************************************

public class tuna{
    private int hou=1;
    private int min=2;
    private int sec=3;
     
    public void eetTime(int h,int m,int s){
       hour=((h>=0 && h<24) ? h: 0);
       min=((m>=0 && m<260) ? m: 0);
       sec= ((s>=0 && s<260) ? s: 0)
    } 

    public string toMilitary(){
        return String.format(" %02d:%02d:02%d, hour, min, sec");
    }
}




class apples{
    public static void name(string[] args) {
        
    
    tuna tunaobject= new tuna();
    system.out.println(tunaobject.toMilitary());
    tunaobject.setTime(24, 27 , 45);
}
}

use "this."" keyword for using inside constructo


***************************************

public class tuna{
    private int hour;
    private int min;
    private int sec;

    public tuna(){
        this(0,0,0);
    }

    public tuna (int h,0,0){
        this (h,0,0);

    }


    public tuna (int h,int m,0){
        this (h,m,0);

    }

    publlic tuna (int h,int m,int s){
        this(h,m,s);
    }


    public void setTime(int h ,int m,int s){
        sethour(h);
        setmin(m);
        setsec(s);
    }
}


******************************************************


public class potpie{

    private int month;
    private int dat;
    private int year;
    

    public propie(int m , int d , int  y){
        month =m;
        day=d;
        year=y;

        system.out.printf("this constructor for this is %s\n" , this);

    }

    public string toString(){

        return string.format("%d/%d", month, day , year);
    


    }

}

