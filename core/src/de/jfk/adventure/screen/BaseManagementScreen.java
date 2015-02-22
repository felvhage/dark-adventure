package de.jfk.adventure.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

import de.jfk.adventure.DarkAdventureGame;

/**
 * Created by Fredde on 22.02.2015.
 */
public class BaseManagementScreen extends AbstractAdventureScreen {


    public BaseManagementScreen(DarkAdventureGame game) {
        super(game);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera().update();
        batch().setProjectionMatrix(camera.combined);

        batch().begin();

        //Hier kommt das Rendering hin.

        batch().end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
