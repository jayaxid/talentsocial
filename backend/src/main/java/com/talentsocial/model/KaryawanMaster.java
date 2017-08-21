package com.talentsocial.models;

import javax.persistence.*;

@Entity
public class KaryawanMaster {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "KARYAWAN_MASTER_SEQ")
    @SequenceGenerator(name = "KARYAWAN_MASTER_SEQ")
    Long id;

    String namaDepan;
    String namaTengah;
    String namaBelakang;
    String tempatLahir;

    public KaryawanMaster() {}
}