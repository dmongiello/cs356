/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPAsignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author davidmongiello
 */
public class IVoteService implements VoteService {
    private ArrayList<Answer> questionTypes; 
    private List<Response> responses = new ArrayList<Response>();  
    
    public void SetQuestionType(QuestionType questionType)
    {
        this.questionTypes = questionType.getAnswerTypes(); 
    }
    public void submitAnwser(Response response)
    {
        responses.add(response);
        
    }
    
    private void sort()
    {
        Collections.sort(responses);
    }
    // Sorting
    

    @Override
    public String toString()
    {
        sort();
        
        for (Response response : responses) 
        {
            
            System.out.println(response);
	}
        return ""; 
    }
    
}
