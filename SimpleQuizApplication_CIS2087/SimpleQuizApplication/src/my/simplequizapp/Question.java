/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.simplequizapp;

/**
 *
 * @author jrosato
 */
public abstract class Question {
    
    protected String questionText;
    
    public Question(String questionText) {
        this.questionText = questionText;
    }
    
    public String getQuestion() { return this.questionText; }
        
    public abstract String getAnswer();
    public abstract boolean checkAnswer(String answer);
    
}
