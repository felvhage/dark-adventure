package de.jfk.adventure.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

import de.jfk.adventure.DarkAdventureGame;

/**
 * Created by Fredde on 22.02.2015.
 */
public class MainMenuScreen extends AbstractAdventureScreen {



    public MainMenuScreen(DarkAdventureGame darkAdventureGame) {
        super(darkAdventureGame);

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

        //Rendering
        font().draw(batch(), "A Dark Adventure ...", 100, 250);
        font().draw(batch(), "Tap anywhere to begin!", 100, 200);
        batch().end();

        if (Gdx.input.isTouched()) {
            //Hier den Screen definieren, der nach dem Splash-Screen kommt.
            game().setScreen(new BaseManagementScreen(game));
            dispose();
        }
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
