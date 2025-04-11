package com.menstrualproj;

import java.time.LocalDate;
import java.util.List;

public class JournalEntry {
    private LocalDate date;
    private boolean isPeriodDay;
    private String mood;
    private List<String> symptoms;
    private String notes;

    public JournalEntry() {

    }

    public JournalEntry(String notes, List<String> symptoms, String mood, boolean isPeriodDay, LocalDate date) {
        this.notes = notes;
        this.symptoms = symptoms;
        this.mood = mood;
        this.isPeriodDay = isPeriodDay;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isPeriodDay() {
        return isPeriodDay;
    }

    public void setPeriodDay(boolean periodDay) {
        isPeriodDay = periodDay;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Date: " + date +
                "\nPeriod Day: " + (isPeriodDay() ? "Yes" : "No")  +
                "\nMood: " + mood +
                "\nSymptoms: " + String.join(", ", symptoms) +
                "\nNotes: " + notes + "\n";
    }
}
