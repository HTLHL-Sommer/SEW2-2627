package at.htlhl.sew2.oop;

public class CarDealer {
    void main() {
        Car vwTiguan = new Car();
        vwTiguan.setModel("VW Tiguan");
        vwTiguan.setPower(150);

        Car vwPolo = new Car();
        vwPolo.setModel("VW Polo Bj 2025");
        vwPolo.setPower(90);


        IO.println(vwPolo.getPower());
        vwPolo.boostPower(30);
        IO.println(vwPolo.getPower());


        IO.println(vwTiguan.getPower());

        Car fiatMultipla = new Car();
        fiatMultipla.setModel("Fiat Multipla Family");
        fiatMultipla.setPower(120);
        IO.println(fiatMultipla.getPower());

        fiatMultipla.setPower(-100);
        IO.println(fiatMultipla.getPower());

    }
}