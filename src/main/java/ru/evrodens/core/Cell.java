package ru.evrodens.core;

public class Cell {
    private Coordinate coordinate;
    private State state;

    public Cell(Coordinate coordinate, State state) {
        this.coordinate = coordinate;
        this.state = state;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
