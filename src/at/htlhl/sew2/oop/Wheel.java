package at.htlhl.sew2.oop;

public class Wheel {
    private String brand;
    private float tireTread;
    private char type;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getTireTread() {
        return tireTread;
    }

    public void setTireTread(float tireTread) {
        this.tireTread = tireTread;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        if (type == 'S' || type == 'W' || type == 'G') {
            this.type = type;
            return;
        }
        IO.println("Falscher Typ, wurde nicht gesetzt");
    }
}
