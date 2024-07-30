package com.example.domainarquitecture.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "detail_responses")
public class DetailResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "response_option")
    private Long responseOption;

//    @Column(name = "question_id")
    @OneToOne
    private Question question;

//    @Column(name = "response_id")
    @OneToOne
    private Response response;

    @Column(name = "response_text")
    private String responseText;

    public DetailResponse() {
    }

    public DetailResponse(Long id, Long responseOption, Question question, Response response, String responseText) {
        this.id = id;
        this.responseOption = responseOption;
        this.question = question;
        this.response = response;
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

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question questionId) {
        this.question = questionId;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response responseId) {
        this.response = responseId;
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
                ", questionId=" + question +
                ", responseId=" + response +
                ", responseText='" + responseText + '\'' +
                '}';
    }
}
