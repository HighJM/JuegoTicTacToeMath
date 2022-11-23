
package juegotictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Archivo de test para la clase VentanaPregunta.
 * @author Anderson Pillimue
 */
public class VentanaPreguntaTest {
    
    public VentanaPreguntaTest() {
    }

    @Test
    public void testGetStackPane() {
        System.out.println("Obtiene el getStackPane");
        VentanaPregunta instance = new VentanaPregunta();
        StackPane expResult = null;
        StackPane result = instance.getStackPane();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetStartButtonOnAction() {
        System.out.println("Inicia la interfaz setStartButtonOnAction");
        EventHandler<ActionEvent> onAction = null;
        VentanaPregunta instance = new VentanaPregunta();
        instance.setStartButtonOnAction(onAction);
        //fail("The test case is a prototype.");
    }
    
}
