package com.ipragmatech.asyncservice;

import com.joanzapata.android.asyncservice.api.annotation.ThrowerParam;

public class DummyErrorMessage {

    private Throwable throwable;
    private Long id;

    public DummyErrorMessage(Throwable throwable, @ThrowerParam("id") Long id) {
        this.throwable = throwable;
        this.id = id;
    }
}