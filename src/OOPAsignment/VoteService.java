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
public interface VoteService {
    
    public void SetQuestionType(QuestionType questionType);
    public void submitAnwser(Response response);
    
    @Override
    public String toString();
    
}
