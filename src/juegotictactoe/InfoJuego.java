package juegotictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

/**
 * Clase principal en donde se ejecutan los métodos que inicializan la interfaz
 * gráfica de la información de los jugadores.
 *
 * @author Juan Miguel Parra Rodriguez
 */
public class InfoJuego {

    private StackPane pane;
    private Label message;
    private Button startGameButton;

    /**
     * Constructor para la clase InfoJuego.
     */
    public InfoJuego() {
        pane = new StackPane();
        pane.setMinSize(ConstantesUI.APP_WIDTH, ConstantesUI.INFO_JUEGO_HEIGHT);
        pane.setTranslateX(ConstantesUI.APP_WIDTH / 2);
        pane.setTranslateY(ConstantesUI.INFO_JUEGO_HEIGHT / 2);

        message = new Label("Tic-Tac-Toe Math");
        message.setMinSize(ConstantesUI.APP_WIDTH, ConstantesUI.INFO_JUEGO_HEIGHT);
        message.setFont(Font.font(24));
        message.setAlignment(Pos.CENTER);
        message.setTranslateY(-20);
        pane.getChildren().add(message);

        startGameButton = new Button("Nuevo Juego");
        startGameButton.setMinSize(135, 30);
        startGameButton.setTranslateY(20);
        pane.getChildren().add(startGameButton);
    }

    /**
     * Método getter para obtener el lienzo principal de la clase InfoJuego.
     *
     * @return StackPane retorna el lienzo principal de la clase InfoJuego.
     */
    public StackPane getStackPane() {
        return pane;
    }

    /**
     * Método para actualizar el label que indica el nombre del juego
     * inicialmente y el turno del jugador.
     *
     * @param message
     */
    public void updateMessage(String message) {
        this.message.setText(message);
    }

    /**
     * Método para mostrar el botón de inicio de juego.
     */
    public void showStartButton() {
        startGameButton.setVisible(true);
    }

    /**
     * Método para ocultar el botón de inicio de juego.
     */
    public void hideStartButton() {
        startGameButton.setVisible(false);
    }

    /**
     * Método para asignar un evento al botón de inicio de juego.
     *
     * @param onAction retorna la acción de inicio de juego.
     */
    public void setStartButtonOnAction(EventHandler<ActionEvent> onAction) {
        startGameButton.setOnAction(onAction);
    }
}
