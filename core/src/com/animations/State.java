package com.animations;

import com.badlogic.gdx.Gdx;
import lombok.Getter;

@Getter
class State {
    private int length1 = 300;
    private int length2 = 250;

    private float x0;
    private float y0;
    private float x1;
    private float y1;
    private float x2;
    private float y2;

    State() {
        x0 = (float) Gdx.graphics.getWidth() / 2;
        y0 = (float) Gdx.graphics.getHeight() / 2;
        x1 = x0 + length1;
        y1 = y0;
        x2 = x1;
        y2 = y1 - length2;
    }

    void updateState() {
    }
}
