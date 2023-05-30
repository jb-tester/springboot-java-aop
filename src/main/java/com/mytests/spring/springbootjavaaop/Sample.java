package com.mytests.spring.springbootjavaaop;

import jakarta.persistence.*;

import java.util.Objects;

/**
 * *
 * <p>Created by irina on 5/24/2023.</p>
 * <p>Project: springboot-java-aop</p>
 * *
 */
@Entity
@Table(name = "sample", schema = "jbtests")
public class Sample {
    private int id;
    private Integer version;
    private String sample;
    private String color;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Basic
    @Column(name = "sample")
    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sample that = (Sample) o;
        return id == that.id && Objects.equals(version, that.version) && Objects.equals(sample, that.sample) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, sample, color);
    }

    @Override
    public String toString() {
        return "Sample{" +
                "id=" + id +
                ", version=" + version +
                ", sample='" + sample + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
