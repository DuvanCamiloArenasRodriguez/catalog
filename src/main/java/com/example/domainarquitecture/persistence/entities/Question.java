package com.example.domainarquitecture.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chapter_id")
    @ManyToOne
    private Chapter chapterId;

    @Column(name = "survey_id")
    @ManyToOne
    private Survey surveyId;

    @Column(name = "question_number")
    private String questionNumber;

    @Column(name = "question_text")
    private String questionText;

    @Column(name = "response_type")
    private String responseType;

    @Column(name = "comment_question")
    private String commentQuestion;

//    Revisarrrrr
    @Column(name = "parent_question_id")
    @OneToMany(mappedBy = "questions")
    private List<Question>  parentQuestionId;
//


    public Question() {
    }

    public Question(Long id, Chapter chapterId, Survey surveyId, String questionNumber, String questionText, String responseType, String commentQuestion, List<Question> parentQuestionId) {
        this.id = id;
        this.chapterId = chapterId;
        this.surveyId = surveyId;
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.responseType = responseType;
        this.commentQuestion = commentQuestion;
        this.parentQuestionId = parentQuestionId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Chapter getChapterId() {
        return chapterId;
    }

    public void setChapterId(Chapter chapterId) {
        this.chapterId = chapterId;
    }

    public Survey getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Survey surveyId) {
        this.surveyId = surveyId;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getCommentQuestion() {
        return commentQuestion;
    }

    public void setCommentQuestion(String commentQuestion) {
        this.commentQuestion = commentQuestion;
    }

    public List<Question> getParentQuestionId() {
        return parentQuestionId;
    }

    public void setParentQuestionId(List<Question> parentQuestionId) {
        this.parentQuestionId = parentQuestionId;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", chapterId=" + chapterId +
                ", surveyId=" + surveyId +
                ", questionNumber='" + questionNumber + '\'' +
                ", questionText='" + questionText + '\'' +
                ", responseType='" + responseType + '\'' +
                ", commentQuestion='" + commentQuestion + '\'' +
                ", parentQuestionId=" + parentQuestionId +
                '}';
    }
}
