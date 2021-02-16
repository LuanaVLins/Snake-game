package snake;

import java.awt.Color;
import java.awt.Point;

public class Constants {

	public static final String GAME_TITLE = "Snake Game!";
	public static final int WINDOW_WIDTH = 600;
	public static final int WINDOW_HEIGHT = 600;
	public static final Color BACKGROUND_COLOR = Color.BLACK;
	public static final Color SNAKE_COLOR = Color.GREEN;
	public static final int SNAKE_PIECE_SIZE = 10;
	public static final int SNAKE_SIZE = 8;
	public static final int SNAKE_INITIAL_X = 220;
	public static final int SNAKE_INITIAL_Y = 400;
	public static final int SNAKE_ELONGATE_PIECES = 5;
	public static final int GAME_MIN_TIME_BETWEEN_KEYBOARD_EVENTS = 40;
	public static final int SLEEP_TIME = 90;
	public static final int FOOD_SIZE = 8;
	public static final Color FOOD_COLOR = Color.RED;
	public static final String GAME_OVER_TEXT = "GAME OVER! %d PONTO(S)";
	public static final Point GAME_OVER_LOCATION = new Point(WINDOW_WIDTH / 2 - 80, WINDOW_HEIGHT / 2);
	public static final Color GAME_OVER_COLOR = Color.RED;

}
