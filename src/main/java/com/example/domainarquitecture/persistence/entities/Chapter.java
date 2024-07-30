package com.example.domainarquitecture.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "chapter")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "survey_id")
    @ManyToOne
    private Survey survey;

    @Column(name = "chapter_number")
    private String chapterNumber;

    @Column(name = "chapter_title")
    private String chapterTitle;

    public Chapter() {
    }

    public Chapter(Long id, Survey survey, String chapterNumber, String chapterTitle) {
        this.id = id;
        this.survey = survey;
        this.chapterNumber = chapterNumber;
        this.chapterTitle = chapterTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey surveyId) {
        this.survey = surveyId;
    }

    public String getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(String chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", surveyId=" + survey +
                ", chapterNumber='" + chapterNumber + '\'' +
                ", chapterTitle='" + chapterTitle + '\'' +
                '}';
    }
}
