/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPAsignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author davidmongiello
 */
public class SimulationDriver {

    public void start()
    {
        // Declarations
        List<Answer> answerTypes = new ArrayList<Answer>();
        List<Student> students = new ArrayList<Student>(); 
        IVoteService vService = new IVoteService(); 
         QuestionType questionType; 
         
        // Randomize Question type with answers
        int temp = (Math.random() <= 0.5) ? 1 : 2;
        if(temp == 1) // A-F question
        {
            questionType = new QuestionAF(); 
        }
        else // True False question
        {
            questionType = new QuestionTF(); 
        }
        // Set questiontype
        vService.SetQuestionType(questionType);
        // Set answers list
        answerTypes = questionType.getAnswerTypes(); 
        
        Random rand = new Random();

        int  n = rand.nextInt(100) + 1;
        // Create Students to answer quetions
        Student aStudent;
        for (int x = 0; x < n;x++)
        {
            Integer j = rand.nextInt(answerTypes.size());
            Response response = new Response(j.toString(), answerTypes.get(j));
            aStudent = new Student(response);
            students.add(aStudent);
            vService.submitAnwser(response);
        }
        
        vService.toString();
        
        
        
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // none static 
        SimulationDriver S1 = new SimulationDriver();
        S1.start();
    }
    
}
