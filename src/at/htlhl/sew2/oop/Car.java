package at.htlhl.sew2.oop;

public class Car {
    private String model; // "VW ID.3", "VW Tiguan", "Renault Twingo"
    private int power; //horsepower 150, 90, 290

    void boostPower(int additionalPower){
        power = power + additionalPower;
    }

    //setter-Methode für power
    void setPower(int pPower){
        if (pPower <= 0){
            IO.println("Sicher nicht! Leistung " + pPower + " nicht zulässig");
            return;
        }
        power = pPower;
    }

    //setter-Methode für model
    void setModel(String pModel){
        model = pModel;
    }

    //getter-Methode für power
    int getPower(){
        return power;
    }

    String getModel(){
        return model;
    }
}
