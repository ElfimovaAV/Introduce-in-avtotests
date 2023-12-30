package max.seminar1;

import org.junit.jupiter.api.BeforeAll;
import org.max.seminar1.Game;

/**
 * абстрактный тест для игры BlackJack
 */
public abstract class AbstractTest {

    static Game game;

    @BeforeAll
    static void init() {
        game = new Game();
    }
}
