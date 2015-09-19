package com.yash.database.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Yash on 9/12/2015.
 */
@Table(name = "QUES_ANSWR")
@Entity
public class QuesAnswr {
    @Id
    String sessionId;
    String allFields;
    String question;
    String answer;
    String sessionIdTxt;
    int retryCount;

    @Column(name = "SESSIONID")
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Column(name = "ALLFIELDS")
    public String getAllFields() {
        return allFields;
    }

    public void setAllFields(String allFields) {
        this.allFields = allFields;
    }

    @Column(name = "QUESTION")
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Column(name = "ANSWER")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Column(name = "RETRYCOUNT")
    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    @Column(name = "SESSIONIDTXT")
    public String getSessionIdTxt() {
        return sessionIdTxt;
    }

    public void setSessionIdTxt(String sessionIdTxt) {
        this.sessionIdTxt = sessionIdTxt;
    }
}
