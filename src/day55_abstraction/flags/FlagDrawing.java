package day55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
        Grid grid = new Grid();
        grid.setColor(0, 0, Color.blue);
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 0, Color.blue);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 1, Color.yellow);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 2, Color.blue);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 3, Color.yellow);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 4, Color.blue);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 5, Color.yellow);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 6, Color.blue);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 7, Color.yellow);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 8, Color.blue);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 9, Color.yellow);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 10, Color.blue);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 11, Color.yellow);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 12, Color.blue);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 13, Color.yellow);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 14, Color.blue);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 15, Color.yellow);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 16, Color.blue);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 17, Color.yellow);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 18, Color.blue);
        }
        for (int i = 0; i < grid.getHt(); i++) {
            grid.setColor(i, 19, Color.yellow);
        }

        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();

        UkraineFlag ukraineFlag = new UkraineFlag();
        ukraineFlag.draw();

    }
}
