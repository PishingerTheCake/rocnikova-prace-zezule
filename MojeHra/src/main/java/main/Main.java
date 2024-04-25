package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("project F.R.E.");

        GameLogic gameLogic = new GameLogic();
        window.add(gameLogic);

        window.pack();

        window.setLocationRelativeTo(null);

            window.setVisible(true);

            gameLogic.setGameThread();


        }
    }

