package ru.evrodens.core;

import ru.evrodens.core.algorithms.Shooting;

public class Game {
    private Shooting algorithmOfShooting;
    private Field field;

    public Coordinate createShoot() {
        return algorithmOfShooting.shoot();
    }

    public Shooting getAlgorithmOfShooting() {
        return algorithmOfShooting;
    }

    public void setAlgorithmOfShooting(Shooting algorithmOfShooting) {
        this.algorithmOfShooting = algorithmOfShooting;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }
}
