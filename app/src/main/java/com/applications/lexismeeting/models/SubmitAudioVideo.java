package com.applications.lexismeeting.models;

public class SubmitAudioVideo {


    /**
     * status : true
     */

    private boolean status;

    private String file;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
