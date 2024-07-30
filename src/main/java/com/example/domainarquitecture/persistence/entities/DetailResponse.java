package com.example.domainarquitecture.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detail_responses")
public class DetailResponse {

    private Long id;

    @Column(name = "response_option")
    private Long responseOption;

    @Column(name = "question_id")
    @OneToOne
    private Question questionId;

    @Column(name = "response_id")
    @OneToOne
    private Response responseId;

    @Column(name = "response_text")
    private String responseText;

    public DetailResponse() {
    }

    public DetailResponse(Long id, Long responseOption, Question questionId, Response responseId, String responseText) {
        this.id = id;
        this.responseOption = responseOption;
        this.questionId = questionId;
        this.responseId = responseId;
        this.responseText = responseText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getResponseOption() {
        return responseOption;
    }

    public void setResponseOption(Long responseOption) {
        this.responseOption = responseOption;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
    }

    public Response getResponseId() {
        return responseId;
    }

    public void setResponseId(Response responseId) {
        this.responseId = responseId;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    @Override
    public String toString() {
        return "DetailResponse{" +
                "id=" + id +
                ", responseOption=" + responseOption +
                ", questionId=" + questionId +
                ", responseId=" + responseId +
                ", responseText='" + responseText + '\'' +
                '}';
    }
}
