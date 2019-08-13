package com.tavisca.workshops.pratham.rover;

class TwoDVector {
    public final int x;
    public final int y;
    public TwoDVector(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public interface Direction {
    TwoDVector move(TwoDVector v);
}

class North implements Direction {

    @Override
    public TwoDVector move(TwoDVector v) {
        return new TwoDVector(v.x, v.y + 1);
    }
}

// newVector = direction.move(oldVector);
