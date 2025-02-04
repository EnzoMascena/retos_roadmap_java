import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainGUI {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Selector de Ejercicios");
        frame.setSize(400, 300); // Tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la ventana al salir

        // Crear un panel para los botones
        JPanel panel = new JPanel();

        // Crear botones para los ejercicios
        JButton buttonEj00 = new JButton("Ejercicio 00");
        JButton buttonEj01 = new JButton("Ejercicio 01");
        JButton buttonEj01Extra = new JButton("Ejercicio 01 Extra");
        JButton buttonEj02 = new JButton("Ejercicio 02");
        JButton buttonEj02Extra = new JButton("Ejercicio 02 Extra");

        // Añadir los botones al panel
        panel.add(buttonEj00);
        panel.add(buttonEj01);
        panel.add(buttonEj01Extra);
        panel.add(buttonEj02);
        panel.add(buttonEj02Extra);

        // Acción para el botón del ejercicio 00
        buttonEj00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EJ_00.main(null); // Llama al main de Ej_00
            }
        });

        // Acción para el botón del ejercicio 01
        buttonEj01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ej_01.main(null); // Llama al main de Ej_01
            }
        });

        // Acción para el botón del ejercicio 01 Extra
        buttonEj01Extra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ej_01_extra.main(null); // Llama al main de Ej_01_extra
            }
        });

        // Acción para el botón del ejercicio 02
        buttonEj02.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ej_02.main(null); // Llama al main de Ej_02
            }
        });

        // Acción para el botón del ejercicio 02 Extra
        buttonEj02Extra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ej_02_extra.main(null); // Llama al main de Ej_02_extra
            }
        });

        // Añadir el panel a la ventana
        frame.add(panel);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
