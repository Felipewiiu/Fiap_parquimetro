package br.com.fiap.challenge_app_parquimetro.usecases;

public enum ParkingPeriodType {

    FIXED_PERIOD("fixedPeriod"),

    PER_HOUR("perHour");

    private final String description;

    ParkingPeriodType(String description) {
        this.description = description;
    }
}
