package uebung9;

public class Car {
    private Reifen[] reifen;
    private Motor motor;
    private Kofferraum kofferraum;
    private double hoechstgeschwindigkeit;
    private int sitze;
    private int tueren;

    public Car(double hoechstgeschwindigkeit){
        this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;

    }


    //getter

    public Reifen[] getReifen(int index) {
        return reifen;
    }

    public Motor getMotor() {
        return motor;
    }

    public Kofferraum getKofferraum() {
        return kofferraum;
    }

    public double getHoechstgeschwindigkeit() {
        return hoechstgeschwindigkeit;
    }

    public int getSitze() {
        return sitze;
    }

    public int getTueren() {
        return tueren;
    }

    //setter


    public void setReifen(Reifen[] reifen) {
        this.reifen = reifen;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setKofferraum(Kofferraum kofferraum) {
        this.kofferraum = kofferraum;
    }

    public void setHoechstgeschwindigkeit(double hoechstgeschwindigkeit) {
        this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
    }

    public void setSitze(int sitze) {
        this.sitze = sitze;
    }

    public void setTueren(int tueren) {
        this.tueren = tueren;
    }

    //features

    public boolean isFasterThanOtherCar(double hoechstgeschwindigkeitdesAnderen) {
        if (hoechstgeschwindigkeitdesAnderen < getHoechstgeschwindigkeit()){
            return true;
        }
        return false;
    }

    public boolean erfolgreichReifenErsetzt(int index, Reifen neu){
        reifen[index] = neu;
        return false;
    }


}