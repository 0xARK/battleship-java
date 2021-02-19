package battle;

/**
 * @author Castella Matéo
 * @version 1.0.0
 * This interface allows to manage a battle ship game
 */

public interface IGame {

	public String description();
	public void start();
	public void endOfGame();

}