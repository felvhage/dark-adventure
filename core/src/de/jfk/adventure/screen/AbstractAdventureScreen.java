package de.jfk.adventure.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.jfk.adventure.DarkAdventureGame;

/**
 * Created by Fredde on 22.02.2015.
 */
public abstract class AbstractAdventureScreen implements Screen {

    final protected DarkAdventureGame game;

    protected OrthographicCamera camera;

    public AbstractAdventureScreen(DarkAdventureGame game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

    }

    protected DarkAdventureGame game(){
        return this.game;
    }

    protected SpriteBatch batch(){
        return this.game.batch;
    }

    protected OrthographicCamera camera(){
        return this.camera;
    }

    protected BitmapFont font(){
        return this.game.font;
    }




}
