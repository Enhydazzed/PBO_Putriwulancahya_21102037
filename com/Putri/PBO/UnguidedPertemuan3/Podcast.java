package com.Putri.PBO.UnguidedPertemuan3;

public class Podcast extends Song {
    private String speaker;

    public Podcast(String title, String speaker, int duration) {
        super(title, "", duration);
        this.speaker = speaker;
    }

    public String getSpeaker() {
        return speaker;
    }
}