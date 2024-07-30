package com.example.domainarquitecture.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "chapter_id")
    @ManyToOne
    private Chapter chapter;

//    @Column(name = "survey_id")
    @ManyToOne
    private Survey survey;

    @Column(name = "question_number")
    private String questionNumber;

    @Column(name = "question_text")
    private String questionText;

    @Column(name = "response_type")
    private String responseType;

    @Column(name = "comment_question")
    private String commentQuestion;

//    Revisarrrrr
//    @Column(name = "parent_question_id")
//    @OneToMany(mappedBy = "questions")
//    private List<Question> parentQuestion;
//


    public Question() {
    }

    public Question(Long id, Chapter chapter, Survey survey, String questionNumber, String questionText, String responseType, String commentQuestion, List<Question> parentQuestion) {
        this.id = id;
        this.chapter = chapter;
        this.survey = survey;
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.responseType = responseType;
        this.commentQuestion = commentQuestion;
//        this.parentQuestion = parentQuestion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapterId) {
        this.chapter = chapterId;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey surveyId) {
        this.survey = surveyId;
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

//    public List<Question> getParentQuestion() {
//        return parentQuestion;
//    }

//    public void setParentQuestion(List<Question> parentQuestionId) {
//        this.parentQuestion = parentQuestionId;
//    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", chapterId=" + chapter +
                ", surveyId=" + survey +
                ", questionNumber='" + questionNumber + '\'' +
                ", questionText='" + questionText + '\'' +
                ", responseType='" + responseType + '\'' +
                ", commentQuestion='" + commentQuestion + '\'' +
//                ", parentQuestionId=" + parentQuestion +
                '}';
    }
}
