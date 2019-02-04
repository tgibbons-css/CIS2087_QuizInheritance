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
public class TrueFalseQuestion extends Question {
    private Boolean answer;
       
    /**
     * Constructor
     * @param questionText - The text for the True/False answer question
     * @param answerText - The correct answer for the short answer question, either "True" or "False", case is irrelevant
     */
    public TrueFalseQuestion(String questionText, String answerText) {
        super(questionText);
        answer = answerText.equalsIgnoreCase("True");
    }
    /**
     * getAnswer()
     * @return The correct answer to this question as a single string, either "True" or "False", case is irrelevant
     */
    @Override
    public String getAnswer() {
        if (answer) {
            return ("True");
        } else {
            return ("False");
        }
    }
    /**
     * getQuestion()
     * @return Adds "True/False" to the question text
     */
    @Override    
    public String getQuestion() {
        return this.questionText + "(True/False)";
    }
    /**
     * checkAnswer(String givenAnswer)
     * @param givenAnswer - The answer the user entered to be compared with the correct answer, either "True" or "False"
     * @return True is givenAnswer matches the correct answer, this is not case-sensitive
     */
    @Override
    public boolean checkAnswer(String givenAnswer) {
        return (answer == givenAnswer.equalsIgnoreCase("True"));
    }
    
}
