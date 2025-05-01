package com.app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Represents a basic ORM-mapped entity using Spring Data JPA.
 *
 * The @Entity annotation designates this class as a database table, and @Id defines the primary key field.
 * This is a simple example of how to create a valid entity class.
 */
@Entity
public class Sample {
    
    @Id
    private long sampleID;
    private String text;

    public Sample(long sampleID, String text) {
        this.sampleID = sampleID;
        this.text = text;
    }

    public Sample(){

    }

    public long getSampleID() {
        return sampleID;
    }

    public void setSampleID(long sampleID) {
        this.sampleID = sampleID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}