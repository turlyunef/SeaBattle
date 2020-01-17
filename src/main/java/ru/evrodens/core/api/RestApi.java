package ru.evrodens.core.api;

import ru.evrodens.core.Game;

public class RestApi implements ApiEngine {
    private Client client;
    private Game game;
    private boolean shooting;
    private boolean gaming;

    public RestApi(Client client, Game game) {
        this.client = client;
        this.game = game;
    }

    void run() {
        while (gaming) {
            if (shooting) {
                client.shoot(game.createShoot());
            } else {
                getEnemyShoot();
            }
        }
    }

    public void getEnemyShoot() {
    }
}
