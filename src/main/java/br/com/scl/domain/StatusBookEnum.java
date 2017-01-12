package br.com.scl.domain;

public enum StatusBookEnum {

    PUBLISHED("PUBLISHED"), DRAFT("DRAFT");

    private String description;

    StatusBookEnum(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

}
