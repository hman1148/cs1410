public class PatternGlider extends Pattern {

    private boolean[][] glider = {{false, true, false}, {false, false, true}, {true, true, true}};

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
        return glider[x][y];
    }
}
