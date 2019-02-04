/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simplequizapp;

/**
 *
 * @author tgibbons
 */
public class MultipleChoiceQuestion extends Question {
    String[] possibleAnswers;
    int answerIndex;
    
    public MultipleChoiceQuestion(String questionText, String[] possibleAnswers, int answerIndex) {
        super(questionText);
        this.possibleAnswers = possibleAnswers;
        this.answerIndex = answerIndex;
    }
    
    /**
     * getQuestion()
     * @return Adds newline after each possible answer
     */
    @Override    
    public String getQuestion() {
        String fullQuestion = questionText + "\n" ;
        for (String s : possibleAnswers) {
            fullQuestion += s + "\n";   
        }
        return fullQuestion;
    }
    
    @Override
    public String getAnswer() {
        return possibleAnswers[answerIndex];
    }

    @Override
    public boolean checkAnswer(String answer) {
       return (answer.equalsIgnoreCase(possibleAnswers[answerIndex]));
    }
    
}
