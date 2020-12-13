package lab27.ex3;

import javax.swing.*;

public class Application extends JFrame {

    public Application() {
        lab27.ex3.GameModel gameModel = new lab27.ex3.GameModel();
        GameView gameView = new GameView(gameModel);
        lab27.ex3.GameController gameController = new lab27.ex3.GameController(gameModel, gameView);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(gameView);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        gameController.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Application::new);
    }

}