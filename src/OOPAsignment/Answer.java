/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPAsignment;

/**
 *
 * @author davidmongiello
 */
public abstract class Answer implements Comparable<Answer> {
    protected String answer; 
    abstract String getAnswer();
    
    // Method compareTo(other)
    // This makes the compare to other like types so the objects can
    // be sorted. 
    @Override
    public int compareTo(Answer other) 
    {
    String a = answer; 
     if (a == null) 
     {
         if (other == null)
         {
             return 0; 
         }
         return -1;
     }
    
     return a.compareTo(other.getAnswer());
     
   }
    
   // This overides the to string method to display answer for the object
   public String toString()
   {
       return answer; 
   }
    
}

