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
    
    @Override
    public int compareTo(Answer other) {
     int cmp = answer.compareTo(other.getAnswer());
     return cmp;
   }
    
}

