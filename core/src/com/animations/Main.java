package com.animations;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Polygon;


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
        sr.line(state.getX0(), state.getY0(), state.getX1(), state.getY1());
        sr.line(state.getX1(), state.getY1(), state.getX2(), state.getY2());
        sr.end();

        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.setColor(Color.RED);
        sr.circle(state.getX0(), state.getY0(), 20);
        sr.setColor(Color.BLUE);
        sr.circle(state.getX1(), state.getY1(), 20);
        sr.setColor(Color.GREEN);
        sr.circle(state.getX2(), state.getY2(), 20);
        sr.end();

        state.updateState();
    }
}
