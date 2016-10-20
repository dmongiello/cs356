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
    // Hold the type of answers that can be given
    private ArrayList<Answer> questionTypes; 
    // Holds the responses submited
    private List<Response> responses = new ArrayList<Response>();  
    
    // Method SetQuestionType
    // Purpose: To take in an array of Answer Objects. 
    public void SetQuestionType(QuestionType questionType)
    {
        this.questionTypes = questionType.getAnswerTypes(); 
    }
    
    // Method SubmitAnswer
    // Purpose: This method accepts an answer from a student. 
    public void SubmitAnswer(Response response)
    {
        responses.add(response);  
    }
    
    // Method Sort()
    // Purpose:  This method sorts the array list of response to make
    // easy counting. 
    private void sort()
    {
        Collections.sort(responses);
    }
    // This method builds a string to output of the responses. 
    @Override
    public String toString()
    {
        // Get the responses in order for easy counting. 
        sort();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int rst =  0;
        Response firstResponse = responses.get(0);
        for (int x = 0;x < responses.size();x++ ) 
        {
            if (x == 0)
            {
               count++; 
            }
            else if(x == responses.size() - 1)
            {
                 sb.append(responses.get(x).getAnswer()).append("\t");
                 count++;
                 sb.append(count);
                 sb.append("\t");
            }
            else
            {
               rst = firstResponse.compareTo(responses.get(x));
               if (rst == 0)
               {
                   count++;
               }
               else
               {
                   sb.append(responses.get(x - 1).getAnswer()).append("\t");
                   sb.append(count);
                   sb.append("\t");
                   count = 1;
                    
                   firstResponse = responses.get(x);
               }
            }
            System.out.println(responses.get(x).getAnswer());
	}
        return sb.toString(); 
    }
    
}
