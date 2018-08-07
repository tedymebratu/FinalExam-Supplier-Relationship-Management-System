package com.domain.quiz.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * The persistent class for the ACCOUNTS database table.
 */
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    Long pid;
    Long productNumber;
    String name;
    Double unitPrice;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date dateMdf;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getDateMdf() {
        return dateMdf;
    }

    public void setDateMdf(Date dateMdf) {
        this.dateMdf = dateMdf;
    }
}
