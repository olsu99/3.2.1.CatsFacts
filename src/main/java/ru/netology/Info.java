package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final int upvotes;

    public Info(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Утверждение: " + text + "\n" + " Автор: " + user + "\n" + " Количество голосов: " + upvotes;
    }
}
