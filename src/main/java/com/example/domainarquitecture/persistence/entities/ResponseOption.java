package com.example.domainarquitecture.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "response_options")
public class ResponseOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "option_value")
    private String optionValue;

    @Column(name = "question_id")
    @ManyToOne
    private Question questionId;

    @Column(name = "comment_response")
    private String commentResponse;

    @Column(name = "option_text")
    private String optionText;

    @Column(name = "question_parent")
    private String questionParent;

    public ResponseOption() {
    }

    public ResponseOption(Long id, String optionValue, Question questionId, String commentResponse, String optionText, String questionParent) {
        this.id = id;
        this.optionValue = optionValue;
        this.questionId = questionId;
        this.commentResponse = commentResponse;
        this.optionText = optionText;
        this.questionParent = questionParent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
    }

    public String getCommentResponse() {
        return commentResponse;
    }

    public void setCommentResponse(String commentResponse) {
        this.commentResponse = commentResponse;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public String getQuestionParent() {
        return questionParent;
    }

    public void setQuestionParent(String questionParent) {
        this.questionParent = questionParent;
    }

    @Override
    public String toString() {
        return "ResponseOption{" +
                "id=" + id +
                ", optionValue='" + optionValue + '\'' +
                ", questionId=" + questionId +
                ", commentResponse='" + commentResponse + '\'' +
                ", optionText='" + optionText + '\'' +
                ", questionParent='" + questionParent + '\'' +
                '}';
    }
}
