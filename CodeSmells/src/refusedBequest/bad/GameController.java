/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refusedBequest.bad;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Fanny
 */
public class GameController implements Controller {

    private String welcome;
    private String divider;
    private String yourMove;
    private String yourMoveThreeSquares;
    private String playAgain;
    private String gameOverDraw;
    private String gameOverWin;
    private String xWins;
    private String oWins;
    private String choosePlayerOne;
    private String choosePlayerTwo;
    private String boardSize;

    public GameController(View gameView) {
        loadViewStrings();
        View view = gameView;
        GameBoard board = new GameBoard();
    }

    private void loadViewStrings() {
        Properties viewStrings = new Properties();
        try {
            viewStrings.load(getClass().getResourceAsStream("/viewstrings.properties"));
        } catch (IOException e) {
            System.out.println(e);
        }

        welcome = viewStrings.getProperty("welcome");
        divider = viewStrings.getProperty("divider");
        yourMove = viewStrings.getProperty("yourmove");
        yourMoveThreeSquares = viewStrings.getProperty("yourmovethreesquares");
        playAgain = viewStrings.getProperty("playagain");
        gameOverDraw = viewStrings.getProperty("gameoverdraw");
        gameOverWin = viewStrings.getProperty("gameoverwin");
        xWins = viewStrings.getProperty("xwins");
        oWins = viewStrings.getProperty("owins");
        choosePlayerOne = viewStrings.getProperty("chooseplayerone");
        choosePlayerTwo = viewStrings.getProperty("chooseplayertwo");
        boardSize = viewStrings.getProperty("boardsize");

    }
 }