package com.david.Library.api.model;

public enum Category {

    THRILLER("thriller"),
    SCIFI("sci-fi"),
    BIOGRAPHY("biography"),
    NONFICTION("non-fiction"),
    FANTASY("fantasy"),
    DRAMA("drama"),
    SELFHELP("self-help"),
    KIDS("kids"),
    PHILOSOPHY("philosophy");

    public final String description;

    private Category(String description) {
        this.description = description;
    }
}
