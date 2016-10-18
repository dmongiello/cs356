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
public class QuestionTF extends QuestionType {
    public ArrayList<Answer> getAnswerTypes()
    {
        this.answers.add(new AnswerTrue());
        this.answers.add(new AnswerFalse());
        return answers; 
        
    }
    
}
