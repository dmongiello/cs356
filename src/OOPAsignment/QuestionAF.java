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
public class QuestionAF extends QuestionType {
    public ArrayList<Answer> getAnswerTypes()
    {
        this.answers.add(new AnswerA());
        this.answers.add(new AnswerB());
        this.answers.add(new AnswerC());
        this.answers.add(new AnswerD());
        this.answers.add(new AnswerE());
        this.answers.add(new AnswerF());
        return answers; 
        
    }
    
}
