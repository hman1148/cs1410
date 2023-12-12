public class PatternBlock extends Pattern {
    private boolean [][] block = {{true, true}, {true, true}};

    @Override
    public int getSizeX() {
        return 2;
    }
    @Override
    public int getSizeY() {
        return 2;
    }

    @Override
    public boolean getCell(int x, int y) {
        return block[x][y];
    }

}
