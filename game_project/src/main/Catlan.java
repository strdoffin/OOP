package main;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Catlan {

    // 0 = empty // 1 = CodeCaster // 2 = NetworkLancer // 3 = MultiBuster
    private int boardWidth = 600;
    private int boardHeight = 650;
    private int timeLeft = 60;
    private int score = 0;
    private int boardsize = 25;
    private int iconSize = 100;

    private JFrame frame = new JFrame("Catlan");
    private JLabel textlabel = new JLabel();
    private JPanel container = new JPanel();
    private JPanel boardpanel = new JPanel();

    private JButton[] board = new JButton[boardsize];
    private int[] boardState = new int[boardsize];

    private ImageIcon codeCaster;
    private ImageIcon networkLancer;
    private ImageIcon multiBuster;

    private Random random = new Random();
    private int selectedIndex = -1;

    private Timer spawnTimer;
    private Timer gameTimer;

    public Catlan() {

        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textlabel.setFont(new Font("Arial", Font.BOLD, 30));
        textlabel.setHorizontalAlignment(JLabel.CENTER);
        textlabel.setOpaque(true);

        updateTopLabel();

        boardpanel.setLayout(new GridLayout(5, 5));

        container.setLayout(new BorderLayout());
        container.add(textlabel);
        frame.add(boardpanel);
        frame.add(container, BorderLayout.NORTH);

        Image codeCasterimg = new ImageIcon(getClass().getResource("./CodecasterFront.png")).getImage();
        codeCaster = new ImageIcon(codeCasterimg.getScaledInstance(iconSize, iconSize, Image.SCALE_SMOOTH));

        Image networkLancerimg = new ImageIcon(getClass().getResource("./NetworkLancerFront.png")).getImage();
        networkLancer = new ImageIcon(networkLancerimg.getScaledInstance(iconSize, iconSize, Image.SCALE_SMOOTH));

        Image multiBusterimg = new ImageIcon(getClass().getResource("./MultibusterFront.png")).getImage();
        multiBuster = new ImageIcon(multiBusterimg.getScaledInstance(iconSize, iconSize, Image.SCALE_SMOOTH));

        for (int i = 0; i < board.length; i++) {
            JButton tile = new JButton();
            tile.setFocusable(false);
            board[i] = tile;
            boardpanel.add(tile);

            int index = i;
            tile.addActionListener(e -> handleClick(index));
        }

        spawnCodeCaster();
        spawnCodeCaster();

        spawnTimer = new Timer(2000, e -> spawnCodeCaster());
        spawnTimer.start();

        gameTimer = new Timer(1000, e -> {
            timeLeft--;
            updateTopLabel();

            if (timeLeft <= 0) {
                gameOver();
            }
        });
        gameTimer.start();

        frame.setVisible(true);
    }

    private void handleClick(int index) {

        if (boardState[index] == 0) {
            return;
        }

        if (selectedIndex == -1) {
            selectedIndex = index;
            board[index].setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            return;
        }

        if (selectedIndex == index) {
            board[index].setBorder(null);
            selectedIndex = -1;
            return;
        }

        if (boardState[selectedIndex] == boardState[index]) {

            boardState[selectedIndex]++;
            boardState[index] = 0;

            updateIcon(selectedIndex);
            board[index].setIcon(null);

            if (boardState[selectedIndex] == 3) {
                winGame();
            }
        }

        board[selectedIndex].setBorder(null);
        selectedIndex = -1;
    }

    private void spawnCodeCaster() {

        int emptyCount = 0;

        for (int i = 0; i < board.length; i++) {
            if (boardState[i] == 0) {
                emptyCount++;
            }
        }

        if (emptyCount == 0) {
//            gameOver();
            return;
        }

        int index;
        do {
            index = random.nextInt(boardsize);
        } while (boardState[index] != 0);

        boardState[index] = 1;
        board[index].setIcon(codeCaster);
    }

    private void updateIcon(int index) {

        switch (boardState[index]) {
            case 1 ->
                board[index].setIcon(codeCaster);
            case 2 ->
                board[index].setIcon(networkLancer);
            case 3 ->
                board[index].setIcon(multiBuster);
            default ->
                board[index].setIcon(null);
        }
    }

    private void updateTopLabel() {
        textlabel.setText("Time: " + timeLeft + "s   Score: " + score);
    }

    private void winGame() {
        spawnTimer.stop();
        gameTimer.stop();

        score = timeLeft * 10;
        updateTopLabel();
        JPanel imgshow = new JPanel();
        JLabel img = new JLabel(multiBuster);
        JLabel text = new JLabel("YOU WIN 🎉\nFinal Score: " + score);
        imgshow.add(img);
        imgshow.add(text);
        JOptionPane.showMessageDialog(frame,
                imgshow,
                "Victory",
                JOptionPane.PLAIN_MESSAGE
        );
        System.exit(0);
    }

    private void gameOver() {
        spawnTimer.stop();
        gameTimer.stop();

        JOptionPane.showMessageDialog(frame,
                "Game Over 💀\nFinal Score: " + score);
        System.exit(0);
    }
}
