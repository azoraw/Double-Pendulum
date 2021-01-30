package com.animations;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Main extends ApplicationAdapter {

    private ShapeRenderer sr;
    private State state;

    @Override
    public void create() {
        sr = new ShapeRenderer();
        state = new State();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        sr.begin(ShapeRenderer.ShapeType.Line);
        sr.setColor(Color.WHITE);
        sr.line((float) state.getX0(), (float) state.getY0(), (float) state.getX1(), (float) state.getY1());
        sr.line((float) state.getX1(), (float) state.getY1(), (float) state.getX2(), (float) state.getY2());
        sr.end();

        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.setColor(Color.BLUE);
        sr.circle((float) state.getX1(), (float) state.getY1(), state.getM1());
        sr.setColor(Color.GREEN);
        sr.circle((float) state.getX2(), (float) state.getY2(), state.getM2());
        sr.end();

        state.updateState();
    }
}
