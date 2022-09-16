package com.home.ITAcademyModul_2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.beans.ConstructorProperties;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue
    private Long id;
    private String pawnshop; //наименование, адрес ломбарда;
    private String fio;  //фамилия, имя, отчество заемщика;
    private String name;  //название вещи
    private Integer pricePawnshop; //оценочная стоимость заложенной вещи;
    private Integer loan; //размер займа;
    private Integer percent; //процентная ставка;
    private String dateStart; //дата предоставления займа
    private String dateFin; //сроки возврата займа

    @ConstructorProperties({})
    public Ticket() {
    }

    @ConstructorProperties({"pawnshop", "fio", "name", "pricePawnshop", "loan", "percent", "dateStart", "dateFin"})
    public Ticket(String pawnshop, String fio, String name, Integer pricePawnshop, Integer loan, Integer percent, String dateStart, String dateFin) {
        this.pawnshop = pawnshop;
        this.fio = fio;
        this.name = name;
        this.pricePawnshop = pricePawnshop;
        this.loan = loan;
        this.percent = percent;
        this.dateStart = dateStart;
        this.dateFin = dateFin;
    }
    //Приложение создано и принадлежит Киселевой Марии Александровне GitHub marika7813
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPawnshop() {
        return pawnshop;
    }

    public void setPawnshop(String pawnshop) {
        this.pawnshop = pawnshop;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPricePawnshop() {
        return pricePawnshop;
    }

    public void setPricePawnshop(Integer pricePawnshop) {
        this.pricePawnshop = pricePawnshop;
    }

    public Integer getLoan() {
        return loan;
    }

    public void setLoan(Integer loan) {
        this.loan = loan;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }
}

