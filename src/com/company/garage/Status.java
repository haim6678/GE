package com.company.garage;

public enum Status {

    NEW,
    IN_PROCESS,
    FIXED,
    RELEASED;


    @Override
    public String toString() {
        switch(this) {
            case NEW: return "NEW";
            case IN_PROCESS: return "IN PROCESS";
            case FIXED: return "FIXED";
            case RELEASED: return "RELEASED";
            default: throw new IllegalArgumentException();
        }
    }
}
