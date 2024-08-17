package org.lesson6.notes.core.domain;

import java.util.Date;

public class Note {

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    //region Constructor
    public Note(
            int id, int userId, String details,
            String title, Date creationDate
    ) {
        this.id = id;
        this.userId = userId;
        this.details = details;
        this.title = title;
        this.creationDate = creationDate;
    }
    //endregion

    //region Public Getters And Setters (Properties)

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getEditDate() {
        return editDate;
    }
    //endregion

    //region Private Fields
    private final int id;
    private final int userId;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;


    //endregion
}
