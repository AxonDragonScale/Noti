package com.axon.ronak.noti;

/**
 * Created by ronak on 19/12/17.
 */

public class Note {
    private String subject;
    private String content;
    private String date;
    private String time;

    public Note() {

    }

    public Note(String subject, String content, String date, String time) {
        this.subject = subject;
        this.content = content;
        this.date = date;
        this.time = time;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateAndTime() {
        return date + " " + time;
    }
}
