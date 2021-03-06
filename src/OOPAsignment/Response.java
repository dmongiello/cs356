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
public class Response  implements Comparable<Response> {
    private String iD;
    private Answer answer;

    public Response(String iD, Answer answer) {
        this.iD = iD;
        this.answer = answer;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
    @Override
    public int compareTo(Response other) {
     Answer a = this.answer; 
     if (a == null) 
     {
         if (other == null || other.answer == null)
         {
             return 0; 
         }
         return -1;
     }
     
     return this.answer.getAnswer().compareTo(other.answer.getAnswer());
     
   }
    
}
