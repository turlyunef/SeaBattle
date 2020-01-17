package ru.evrodens.core;

import java.util.List;

public class Field {
    List<Cell> cells;

    public Field(List<Cell> cells) {
        this.cells = cells;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }
}
