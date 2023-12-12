public class PatternBlinker extends Pattern {


    private boolean[][] blinker = {{false, false, false}, {true, true, true}, {false, false, false}};

    @Override
    public int getSizeX() {
        return 3;
    }

    @Override
    public int getSizeY() {
        return 3;
    }

    @Override
    public boolean getCell(int x, int y) {
        return blinker[x][y];
    }
}
