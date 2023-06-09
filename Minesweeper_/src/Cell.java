public class Cell {
    private byte value;
    public boolean hasBomb;
    public boolean isFlagged;
    public boolean isShown;

    public Cell() {
        hasBomb = false;
        isFlagged = false;
        isShown = false;
        value = 0;
    }
    public void setValue(byte value){
        if(value < 0 || value > 8){
            throw new IllegalArgumentException("The value of a cell cannot be less than 0 or more than 8");
        }
        this.value = value;
    }

    public byte getValue(){
        return this.value;
    }
}
