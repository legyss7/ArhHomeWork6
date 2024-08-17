package org.lesson6.database;

import java.util.Date;

public class NotesRecord {
    private final int id;
    private int userId;
    private String title;
    private String details;
    private final Date creationDate;

    private static int counter = 1000;

    {
        id = ++counter;
    }

    public NotesRecord(String title, String details) {
        this.title = title;
        this.details = details;
        creationDate = new Date();
    }

    private Date editDate;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public Date getCreationData() {
        return creationDate;
    }

    public Date getEditDate() {
        return editDate;
    }
}
