/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPAsignment;

import java.util.ArrayList;

/**
 *
 * @author davidmongiello
 */
public abstract class QuestionType  {
    private String question;
    protected ArrayList<Answer> answers = new ArrayList<Answer>(); 
    
    public String getQuestion()
    {
        return question; 
    }
    
    abstract ArrayList<Answer> getAnswerTypes();
      
}
