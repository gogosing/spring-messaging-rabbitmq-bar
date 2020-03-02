package me.gogosing.model.message;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by JinBum Jeong on 2020/03/02.
 */
public class BarMessage {

    public BarMessage() {}

    public BarMessage(String contents) {
        this.contents = contents;
    }

    @JsonProperty(value = "contents")
    private String contents;

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
