package com.example.testing.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nama;
    private String keterangan;
    private Integer qty; // 🔥 WAJIB kalau dipakai di service

    public Long getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Integer getQty() { // 🔥 FIX ERROR
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}