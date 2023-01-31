public class Cube {
    //properties
    private int side;
    //constructors
    public Cube(){
        side = 1;
    }
    public Cube(int s){
        this.side = s;
        if (s < 1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }

    //methods

    public int getSide(){
        return side;
    }
    public void setSide(int newSide){
        this.side = newSide;
        if (newSide < 1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }
    public int getVolume(){
        return side*side*side;
    }

    public int getSurfaceArea(){
        return side*side*6;
    }

}
