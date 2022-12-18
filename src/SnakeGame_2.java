import javax.swing.*;

public class SnakeGame_2  extends JFrame {
    private GameBoard board;
    public SnakeGame_2(){
        board=new GameBoard();
        add(board);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("snakegame");

    }
    public static void main(String[] args){
        JFrame snakeGame=new SnakeGame_2();
    }
}
