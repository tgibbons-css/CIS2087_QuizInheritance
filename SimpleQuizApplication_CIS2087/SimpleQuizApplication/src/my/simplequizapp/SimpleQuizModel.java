package my.simplequizapp;

import java.util.Collections;   //class contains static utility methods for collections, such as lists
import java.util.List;          //abstract class representing a list of objects
import java.util.ArrayList;     //specific implementation of the List abstract class using an array to store data

/**
 * SimpleQuizModel implements a list of quiz questions 
 * Based on the assignment posted at: http://cs.calvin.edu/books/processing/c13oop/lab.html
 * 
 * @author jrosato
 */
public class SimpleQuizModel {

	private List<Question> myQuestions;
	private int currentQuestion; //index of the current question being displayed

	public SimpleQuizModel()  {
		myQuestions = new ArrayList<Question>();

                //Add your questions here
                //This example uses a ShortAnswerQuestion but they could be they other types, too
                //such as FillInBlankQuestion or TrueFalseQuestion
		myQuestions.add(new ShortAnswerQuestion(
				"What is the name of Jerry Lee Lewis's biggest solid gold hit?",
				"Great Balls of Fire"));
                //ADD MORE EXAMPLE QUESTIONS HERE
                
                
                
                
                //Shuffle the questions and set the starting one to zero
		Collections.shuffle(myQuestions);
		currentQuestion = 0;
	}

	/**
	 * Return the full specification for the current question.
	 * 
	 * @return the full question
	 */
	public String getCurrentQuestion() {
		return myQuestions.get(currentQuestion).getQuestion();
	}

	/**
	 * Return the answer to the current question
	 * 
	 * @return the answer
	 */
	public String getCurrentAnswer() {
		return myQuestions.get(currentQuestion).getAnswer();
	}

	/**
	 * Returns true if the given answer is correct for the current question.
	 * 
	 * @param answer
	 *            the user's answer
	 * @return true if and only if the given answer is correct
	 */
	public boolean checkCurrentAnswer(String answer) {
		return myQuestions.get(currentQuestion).checkAnswer(answer);
	}

	/**
	 * Returns true if this quiz has another question.
	 * 
	 * @return true if and only if this quiz has another question
	 */
	public boolean hasNext() {
		return currentQuestion < myQuestions.size() - 1;
	}

	/**
	 * Advance to the next question.
	 * 
	 * @throws Exception
	 *             if there are no more questions
	 */
	public void next() {
            if (currentQuestion == myQuestions.size() - 1) 
                //put it back at the first question
		currentQuestion = 0;
            else
		currentQuestion++;
	}

}
