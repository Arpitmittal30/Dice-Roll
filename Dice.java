
import java.util.Scanner;
public class Dice{
    int numOfSides;
    
    public Dice(int numOfSides){
        this.numOfSides = numOfSides;
        
    }
    public static void main(String[] args){
        System.out.println("Enter no of sides");
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        Dice d1 = new Dice(n);
        String str = d1.roll();
        System.out.println(str);
    
      
    }
    public String roll(){
        int max = 0;
        if(this.numOfSides ==2){
            max=2;
        }
        else if(this.numOfSides ==4){
            max=4;
        }
        else if(this.numOfSides ==6){
            max=6;
        }
         
       int result=(int) (Math.random() * ((max - 1) + 1)) + 1;
       
       if(this.numOfSides ==2){
           if(result ==1){
               return ("HEAD");
           }
           else{ return ("TAIL");}
       }
      else{     
      return (Integer.toString(result));
      }
    }
}