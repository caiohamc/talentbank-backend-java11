package br.com.caioalbuquerque.talentbank.domain.entities;

import br.com.caioalbuquerque.talentbank.domain.enums.GenderEnum;
import br.com.caioalbuquerque.talentbank.domain.enums.LanguageEnum;
import br.com.caioalbuquerque.talentbank.domain.enums.OccupationAreaEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Caio Henrique Albuquerque
 * @since 17/03/22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String email;

    private String phone;

    private GenderEnum gender;

    @Column(name = "occupation_area")
    private OccupationAreaEnum occupationArea;

    @Column(name = "preferred_language")
    private LanguageEnum preferredLanguage;

    @Column(name = "years_of_experience")
    private Integer yearsOfExperience;

    @Column(name = "gross_salary")
    private Double grossSalary;

    @Column(name = "salary_claim")
    private Double salaryClaim;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "update_date")
    private Date updateDate;

    public Candidate(String name, String email, String phone, GenderEnum gender, OccupationAreaEnum occupationArea,
                     LanguageEnum preferredLanguage, Integer yearsOfExperience,
                     Double grossSalary, Double salaryClaim, Date creationDate, Date updateDate) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.occupationArea = occupationArea;
        this.preferredLanguage = preferredLanguage;
        this.yearsOfExperience = yearsOfExperience;
        this.grossSalary = grossSalary;
        this.salaryClaim = salaryClaim;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }
}