package War_Preperations;

public class Sword {
    Gemstone gem;
    Material mat;
    int length, width;

    public Sword(Material mat, Gemstone gem, int length, int width) {
        this.mat = mat;
        this.gem = gem;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return STR."this sword is made out of \{this.mat} and has \{this.gem} embedded in the hilt is \{this.length} long with a crossguard width of \{this.width}!";
    }
}
