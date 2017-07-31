package com.company;

public class Bed {

    private BedFrame bedframe;
    private Matress matress;

    public Bed(BedFrame bedframe, Matress matress) {
        this.bedframe = bedframe;
        this.matress = matress;
    }

    public BedFrame getBedframe() {
        return bedframe;
    }

    public Matress getMatress() {
        return matress;
    }
}
