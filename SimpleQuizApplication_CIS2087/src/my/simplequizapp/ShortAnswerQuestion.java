/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simplequizapp;

/**
 *
 * @author CIS 2087 instructors
 */
public class ShortAnswerQuestion extends Question {
    private String answer;
    
    /**
     * Constructor
     * @param questionText - The text for the short answer question
     * @param answerText - The correct answer for the short answer question, case is irrelevant
     */
    public ShortAnswerQuestion(String questionText, String answerText) {
        super(questionText);
        answer = answerText;
    }
    /**
     * getAnswer()
     * @return The correct answer to this question as a single string
     */
    @Override
    public String getAnswer() {
        return (answer);
    }
    /**
     * checkAnswer(String givenAnswer)
     * @param givenAnswer - The answer the user entered to be compared with the correct answer
     * @return True is givenAnswer matches the correct answer, this is not case-sensitive
     */
    @Override
    public boolean checkAnswer(String givenAnswer) {
        return (answer.equalsIgnoreCase(givenAnswer));
    }
    
}
