package juegotictactoe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Clase principal en donde se ejecutan los metodos que inicializan toda la
 * interfaz gráfica.
 * @author Anderson Pillimue
 */
public class JuegoTicTacToe extends Application {

    private InfoJuego infoJuego;
    private TableroJuego tablero;

    /**
     * Método propio de JavaFx para inicializar la interfaz gráfica principal.
     * @param primaryStage recibe un parametro de tipo Stage el cual debe ser
     * ser el lienzo principal.
     */
    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();
            Scene scene = new Scene(root, ConstantesUI.APP_WIDTH, ConstantesUI.APP_HEIGHT);
            initLayout(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método principal para inicializar toda la aplicación.
     * @param args 
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Método para inicializar el layout principal de la interfaz gráfica.
     * @param root Recibe el lienzo principal - root.
     */
    private void initLayout(BorderPane root) {
        initInfoJuego(root);
        initTablero(root);
    }

    /**
     * Método para inicializar el la interfaz gráfica que representa la 
     * información del juego y boton de inicio del juego.
     * @param root Recibe el lienzo principal - root.
     */
    private void initInfoJuego(BorderPane root) {
        infoJuego = new InfoJuego();
        infoJuego.setStartButtonOnAction((startNewGame()));
        root.getChildren().add(infoJuego.getStackPane());
    }

    /**
     * Método para iniciar un nuevo juego o reiniciar un juego cuando se ha
     * finalizado una partida.
     * @return EventHandler de tipo ActionEvent.
     */
    private EventHandler<ActionEvent> startNewGame() {
        return (ActionEvent e) -> {
            infoJuego.hideStartButton();
            infoJuego.updateMessage("Turno para X");
            tablero.startNewGame();
        };
    }

    /**
     * Método para inicializar el tablero de juego.
     * @param root Recibe el lienzo principal - root.
     */
    private void initTablero(BorderPane root) {
        tablero = new TableroJuego(infoJuego);
        root.getChildren().add(tablero.getStackPane());
    }

}
