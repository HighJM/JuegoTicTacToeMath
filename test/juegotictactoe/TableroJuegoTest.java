package juegotictactoe;

import javafx.scene.layout.StackPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Archivo de test para la clase TableroJuego.
 *
 * @author Anderson Pillimue
 */
public class TableroJuegoTest {

    public TableroJuegoTest() {

    }

    @Test
    public void testStartNewGame() {
        System.out.println("startNewGame");
        TableroJuego instance = null;
        instance.startNewGame();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testChangePlayerTurn() {
        System.out.println("changePlayerTurn");
        TableroJuego instance = null;
        instance.changePlayerTurn();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetPlayerTurn() {
        System.out.println("getPlayerTurn");
        TableroJuego instance = null;
        String expResult = "X";
        String result = instance.getPlayerTurn();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetStackPane() {
        System.out.println("getStackPane");
        TableroJuego instance = null;
        StackPane expResult = null;
        StackPane result = instance.getStackPane();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCheckForWinner() {
        System.out.println("checkForWinner");
        TableroJuego instance = null;
        instance.checkForWinner();
        //fail("The test case is a prototype.");
    }

}
