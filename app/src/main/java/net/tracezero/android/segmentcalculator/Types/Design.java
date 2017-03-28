package net.tracezero.android.segmentcalculator.Types;

/**
 * Created by Dave on 3/26/2017.
 */

public class Design {
    private double OuterDiameter;
    private double WallThickness;
    private int NumberOfSides;

    public double getOuterDiameter() {
        return OuterDiameter;
    }

    public void setOuterDiameter(double outerDiameter) {
        if (outerDiameter <= 0)
            throw new IllegalArgumentException("Outer diameter must be positive and greater than zero");
        OuterDiameter = outerDiameter;
    }

    public double getWallThickness() {
        return WallThickness;
    }

    public void setWallThickness(double wallThickness) {
        if (wallThickness <= 0)
            throw new IllegalArgumentException("Wall thickness must be positive and greater than zero");
        WallThickness = wallThickness;
    }

    public int getNumberOfSides() {
        return NumberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        if (numberOfSides <= 0)
            throw new IllegalArgumentException("Number of sides must be positive and greater than zero");
        NumberOfSides = numberOfSides;
    }
}
