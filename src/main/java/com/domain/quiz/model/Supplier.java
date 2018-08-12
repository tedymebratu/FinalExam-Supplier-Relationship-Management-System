package com.domain.quiz.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
public class Supplier implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    private int supplierNumber;
    private String name;
    private String contactPhoneNumber;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.PERSIST)
    private List<Product> products;


    public Supplier() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public int getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(int supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
