public class LifeSimulator {

    private int sizeX;
    private int sizeY;
    private boolean[][] simGrid;

    public LifeSimulator(int sizeX, int sizeY) {

        this.sizeX = sizeX;
        this.sizeY = sizeY;
        simGrid = new boolean[sizeX][sizeY];

    }

    public int getSizeX() {
        return this.sizeX;
    }

    public int getSizeY() {
        return this.sizeY;
    }

    public boolean getCell(int x, int y) {
        if (((x < 0) || (y < 0)) || ((x >= this.getSizeX()) || (y >= this.getSizeY()))) {
            return false;
        }
        return simGrid[x][y];
    }

    private void setSquare(int x, int y, boolean value) {
        this.simGrid[x][y] = value;
    }

    public void insertPattern(Pattern pattern, int startX, int startY) {
        for (int i = 0; i < pattern.getSizeX(); i++) {
            for (int j = 0; j < pattern.getSizeY(); j++) {
                this.setSquare(startX + i, startY + j, pattern.getCell(i, j));
            }
        }
    }

    public void update() {

        boolean[][] updated = new boolean[this.getSizeX()][this.getSizeY()];

        for (int i = 0; i < simGrid.length; i++) {
            for (int j = 0; j < simGrid[i].length; j++) {
                int count = this.getNeighbor(i, j); // neighbor count

                if (this.getCell(i, j)) {
                    updated[i][j] = count >= 2 && count <= 3;
                } else if (!this.getCell(i, j) && count == 3) {
                    updated[i][j] = true;
                }
            }
        }
        simGrid = updated;
    }

    private int getNeighbor(int x, int y) {
        int count = 0;

        if ((this.getCell(x + 1, y + 1))) {
            count ++;
        }
        if ((this.getCell(x + 1, y - 1))) {
            count ++;
        }
        if ((this.getCell(x - 1 , y + 1))) {
            count ++;
        }
        if ((this.getCell(x - 1, y - 1))) {
            count ++;
        }
        if ((this.getCell(x + 1, y))) {
            count ++;
        }
        if ((this.getCell(x - 1, y))) {
            count ++;
        }
        if ((this.getCell(x, y + 1))) {
            count ++;
        }
        if ((this.getCell(x, y - 1))) {
            count ++;
        }
    return count;
    }
}
