// Reference for Lanterna 3: https://github.com/mabe02/lanterna/blob/master/docs/contents.md
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;


public class ConwaysLife {
    public static void main(String[] args) {
        try {
            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            Screen screen = new TerminalScreen(terminal);
            TextGraphics graphics = screen.newTextGraphics();

            TerminalSize size = screen.getTerminalSize();
            LifeSimulator simulation = new LifeSimulator(size.getColumns(), size.getRows());
            screen.startScreen();
            screen.setCursorPosition(null);
            simulation.insertPattern(new PatternGlider(), 0, 0);
            simulation.insertPattern(new PatternAcorn(), 10, 10);
            simulation.insertPattern(new PatternBlinker(), 30, 20);
            simulation.insertPattern(new PatternBlock(), 15, 20);

            for (int i = 0; i < 1000; i++) {
                render(simulation, screen, graphics);   // Render the current state of the simulation
                Thread.yield();                         // Let the JVM have some time to update other things
                Thread.sleep(50);                // Sleep for a bit to make for a nicer paced animation
                simulation.update();                    // Tell the simulation to update
            }

            screen.stopScreen();
        } catch (Exception ex) {
            System.out.println("Something bad happened: " + ex.getMessage());
        }
    }
    public static void render(LifeSimulator lifeSimulator, Screen screen, TextGraphics textGraphics) {
        for (int i = 0; i < lifeSimulator.getSizeX(); i++) {
            for (int j = 0; j < lifeSimulator.getSizeY(); j++) {
                if (lifeSimulator.getCell(i, j)) {
                    textGraphics.setCharacter(i, j, 'X');
                } else {
                    textGraphics.setCharacter(i,j,' ');
                }
            }
        }
        try {
            screen.refresh();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
