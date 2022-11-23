package juegotictactoe;

import javafx.stage.Stage;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Archivo de test para la clase Main.
 * @author Anderson Pillimue
 */
public class JuegoTicTacToeTest {
    
    public JuegoTicTacToeTest() {
    }

    @Test
    public void testStart() {
        System.out.println("start");
        Stage primaryStage = null;
        JuegoTicTacToe instance = new JuegoTicTacToe();
        instance.start(primaryStage);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JuegoTicTacToe.main(args);
        //fail("The test case is a prototype.");
    }
    
}
