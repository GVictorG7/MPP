package domain;

import java.io.Serializable;
import java.rmi.Remote;

public class Cursa implements Serializable, Remote {
    private int id;
    private int cap;
    private int nrPart;

    public Cursa(int id, int cap, int nrPart) {
        this.id = id;
        this.cap = cap;
        this.nrPart = nrPart;
    }

    public Cursa(String id, String cap, String nrPart) {
        this.id = Integer.parseInt(id);
        this.cap = Integer.parseInt(cap);
        this.nrPart = Integer.parseInt(nrPart);
    }

    public Cursa() {
    }

    public int getCap() {
        return cap;
    }

    public int getId() {
        return id;
    }

    public int getNrPart() {
        return nrPart;
    }
}
