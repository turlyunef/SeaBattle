package ru.evrodens.core.api;

import ru.evrodens.core.Coordinate;

public interface Client {
    StepResponse shoot(Coordinate cell);
}
