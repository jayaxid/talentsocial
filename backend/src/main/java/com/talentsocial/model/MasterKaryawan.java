package com.talentsocial.models;

import javax.persistence.*;

@Entity
public class MasterKaryawan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "KARYAWAN_MASTER_SEQ")
    @SequenceGenerator(name = "KARYAWAN_MASTER_SEQ")
    Long id;

    String name;

    public MasterKaryawan() {}

    public MasterKaryawan(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "The name is " + this.name;
    }
}