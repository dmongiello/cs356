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
public class Student implements Voter {
    private Response response; 

    public Student(Response response) {
        this.response = response;
    }
    
    public void UpdateAnswer(Answer newAnswer)
    {
       this.response.setAnswer(newAnswer);
    }
    public String GetID()
    {
        return response.getiD(); 
    }
    
}
