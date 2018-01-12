package com.aubrey.demo.data.entities;

import org.hibernate.validator.constraints.NotBlank;

import java.math.BigDecimal;
import java.util.List;

public class Project {

    private Long projectID;
    private String name;

    @NotBlank(message="You must provide a name field")
    private String description;
    private Sponsor sponsor;
    private BigDecimal authorizedHours;
    private BigDecimal authorizedFunds;
    private String year;
    private boolean special;
    private String type;
    private List<String> pointsOfContact;

    public Long getProjectID() {
        return projectID;
    }

    public void setProjectID(Long projectID) {
        this.projectID = projectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Spring MVC Databinding in action");
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public BigDecimal getAuthorizedHours() {
        return authorizedHours;
    }

    public void setAuthorizedHours(BigDecimal authorizedHours) {
        this.authorizedHours = authorizedHours;
    }

    public BigDecimal getAuthorizedFunds() {
        return authorizedFunds;
    }

    public void setAuthorizedFunds(BigDecimal authorizedFunds) {
        this.authorizedFunds = authorizedFunds;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getPointsOfContact() {
        return pointsOfContact;
    }

    public void setPointsOfContact(List<String> pointsOfContact) {
        this.pointsOfContact = pointsOfContact;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectID=" + projectID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sponsor=" + sponsor +
                ", authorizedHours=" + authorizedHours +
                ", authorizedFunds=" + authorizedFunds +
                ", year='" + year + '\'' +
                ", special=" + special +
                ", type='" + type + '\'' +
                ", pointsOfContact=" + pointsOfContact +
                '}';
    }
}
