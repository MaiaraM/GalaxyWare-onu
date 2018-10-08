/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Guerino
 */
public class Calculator {
    private float questionValue;
    private float answerValue;
    private float averange;

    public Calculator(float questionValue, float answerValue, float averange) {
        this.questionValue = questionValue;
        this.answerValue = answerValue;
        this.averange = averange;
    }
    
    public void Averange (Questions questionWeight, Answers answerWeigth){
       averange = (answerValue * Float.parseFloat(answerWeigth.toString())) + 
               (Float.parseFloat(questionWeight.toString())*questionValue);
       
    }

    public float getQuestionValue() {
        return questionValue;
    }

    public void setQuestionValue(float questionValue) {
        this.questionValue = questionValue;
    }

    public float getAnswerValue() {
        return answerValue;
    }

    public void setAnswerValue(float answerValue) {
        this.answerValue = answerValue;
    }

    public float getAverange() {
        return averange;
    }

    public void setAverange(float averange) {
        this.averange = averange;
    }
    
}
