package com.application.posapplication.model;

public enum EnumModal {
    can("can"),
    could("could"),
    may("may"),
    might("might"),
    must("must"),
    shall("shall"),
    should("should"),
    will("will");

    private String enumModal;

    EnumModal(String enumModal) {
        this.enumModal = enumModal;
    }

    public String getEnumModal() {
        return enumModal;
    }
}
