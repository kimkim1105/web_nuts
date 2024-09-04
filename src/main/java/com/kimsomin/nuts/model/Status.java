package com.kimsomin.nuts.model;

public enum Status {
    draft(0),
    active(1),
    inactive(2),
    deleted(3),
    ;

    public final Integer status;

    Status(Integer status) {
        this.status = status;
    }
}
