public class PatternAcorn extends Pattern{

    private boolean[][] accorn =
            {{false, true, false, false, false, false, false},
            {false, false, false , true, false, false , false},
            {true, true, false, false, true, true, true}};

    @Override
    public int getSizeX() {
        return 3;
    }

    @Override
    public int getSizeY() {
        return 7;
    }

    @Override
    public boolean getCell(int x, int y) {
        return accorn[x][y];
    }

}
