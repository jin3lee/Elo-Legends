package com.elolegends.elolegends;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class EloLegendsGame extends ApplicationAdapter {

	enum STATE {
        SPLASH_LOGO,
        SPLASH_LOADING,
        MENU,
        GAME_START,
        GAME_ACTIVE,
        GAME_END,
    }

    STATE state;
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
        state = STATE.SPLASH_LOADING;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        runGame();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

    public void runGame()
    {
        switch (state) {
            case SPLASH_LOGO:
                batch.begin();
                batch.draw(img, 0, 0);
                batch.end();
                break;
            case SPLASH_LOADING:
                batch.begin();
                batch.draw(img, 12, 12);
                batch.end();
                break;
            case GAME_START:
                break;
            case GAME_ACTIVE:
                break;
            case GAME_END:
                break;
            default:
                break;
        }
    }
}
