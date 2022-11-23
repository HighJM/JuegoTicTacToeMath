package juegotictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Archivo de test para la clase InfoJuego.
 * @author Anderson Pillimue
 */
public class InfoJuegoTest {
    
    public InfoJuegoTest() {
    }

    @Test
    public void testGetStackPane() {
        System.out.println("getStackPane");
        InfoJuego instance = new InfoJuego();
        StackPane expResult = null;
        StackPane result = instance.getStackPane();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateMessage() {
        System.out.println("updateMessage");
        String message = "";
        InfoJuego instance = new InfoJuego();
        instance.updateMessage(message);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testShowStartButton() {
        System.out.println("showStartButton");
        InfoJuego instance = new InfoJuego();
        instance.showStartButton();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testHideStartButton() {
        System.out.println("hideStartButton");
        InfoJuego instance = new InfoJuego();
        instance.hideStartButton();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetStartButtonOnAction() {
        System.out.println("setStartButtonOnAction");
        EventHandler<ActionEvent> onAction = null;
        InfoJuego instance = new InfoJuego();
        instance.setStartButtonOnAction(onAction);
        //fail("The test case is a prototype.");
    }
    
}
