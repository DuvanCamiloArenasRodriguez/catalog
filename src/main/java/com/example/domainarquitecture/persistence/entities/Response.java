package com.example.domainarquitecture.persistence.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "responses")
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "response_time")
    private LocalTime responseTime;

    @Column(name = "response_date")
    private Date responseDate;

    @Column(name = "survey_id")
    @ManyToOne
    private Survey surveyId;

    @Column(name = "name_respondent")
    private String nameRespondent;

    public Response() {
    }

    public Response(Long id, LocalTime responseTime, Date responseDate, Survey surveyId, String nameRespondent) {
        this.id = id;
        this.responseTime = responseTime;
        this.responseDate = responseDate;
        this.surveyId = surveyId;
        this.nameRespondent = nameRespondent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(LocalTime responseTime) {
        this.responseTime = responseTime;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public Survey getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Survey surveyId) {
        this.surveyId = surveyId;
    }

    public String getNameRespondent() {
        return nameRespondent;
    }

    public void setNameRespondent(String nameRespondent) {
        this.nameRespondent = nameRespondent;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", responseTime=" + responseTime +
                ", responseDate=" + responseDate +
                ", surveyId=" + surveyId +
                ", nameRespondent='" + nameRespondent + '\'' +
                '}';
    }
}
