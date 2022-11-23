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
 * gráfica de la ventana o el pop-up donde se le presenta la pregunta al
 * jugador.
 *
 * @author Anderson Pillimue
 */
public class VentanaPregunta {

    private StackPane pane;
    private Label message, field;
    private Button submit1, submit2, submit3;
    private int answer;

    public VentanaPregunta() {
        pane = new StackPane();
        pane.setMinSize(ConstantesUI.APP_WIDTH, ConstantesUI.INFO_JUEGO_HEIGHT);
        pane.setTranslateX(ConstantesUI.APP_WIDTH / 2);
        pane.setTranslateY(ConstantesUI.INFO_JUEGO_HEIGHT / 2);

        message = new Label("Pregunta 1");
        message.setMinSize(ConstantesUI.APP_WIDTH, ConstantesUI.INFO_JUEGO_HEIGHT);
        message.setFont(Font.font(20));
        message.setAlignment(Pos.CENTER);
        message.setTranslateY(-20);
        pane.getChildren().add(message);

        // este field debe generar preguntas aleatorias. Crear el método.
        field = new Label("");

        // botones para las multiples respuestas
        submit1 = new Button("Opción 1");
        submit1.setMinSize(135, 30);
        submit1.setTranslateY(20);
        pane.getChildren().add(submit1);
        
        submit2 = new Button("Opción 2");
        submit2.setMinSize(135, 30);
        submit2.setTranslateY(20);
        pane.getChildren().add(submit2);
        
        submit3 = new Button("Opción 3");
        submit3.setMinSize(135, 30);
        submit3.setTranslateY(20);
        pane.getChildren().add(submit3);
    }

    /**
     * Método getter para obtener el lienzo principal de la clase Ventana
     * Pregunta.
     *
     * @return StackPane retorna el lienzo principal de la clase
     * VentanaPregunta.
     */
    public StackPane getStackPane() {
        return pane;
    }

    /**
     * Método para asignar un evento al botón de inicio de juego.
     *
     * @param onAction retorna la acción de inicio de juego.
     */
    public void setStartButtonOnAction(EventHandler<ActionEvent> onAction) {
        submit1.setOnAction(onAction);
    }
}
