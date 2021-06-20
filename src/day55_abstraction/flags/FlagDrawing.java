package day55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
        Grid grid = new Grid();
        grid.setColor(0, 0, Color.blue);
        for (int i = 0; i < grid.getWd(); i++) {
            grid.setColor(0, i, Color.blue);
        }
        for (int i = 0; i < grid.getWd(); i++) {
            grid.setColor(1, i, Color.yellow);
        }
        for (int i = 0; i < grid.getWd(); i++) {
            grid.setColor(2, i, Color.blue);
        }
        for (int i = 0; i < grid.getWd(); i++) {
            grid.setColor(3, i, Color.yellow);
        }
        for (int i = 0; i < grid.getWd(); i++) {
            grid.setColor(4, i, Color.blue);
        }
        for (int i = 0; i < grid.getWd(); i++) {
            grid.setColor(5, i, Color.yellow);
        }
        for (int i = 0; i < grid.getWd(); i++) {
            grid.setColor(6, i, Color.blue);
        }
        for (int i = 0; i < grid.getWd(); i++) {
            grid.setColor(7, i, Color.yellow);
        }
        for (int i = 0; i < grid.getWd(); i++) {
            grid.setColor(8, i, Color.blue);
        }
        for (int i = 0; i < grid.getWd(); i++) {
            grid.setColor(9, i, Color.yellow);
        }

        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();

        UkraineFlag ukraineFlag = new UkraineFlag();
        ukraineFlag.draw();

    }
}
