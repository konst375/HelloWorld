package basics.baseOOP;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double length() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    @Override
    public String toString() {
        return "basics.baseOOP.Vector: {x: " + x + ", y: " + y + ", z: " + z + "}";
    }

    public double scalarProduct(Vector vector) {
        return (x * vector.getX()) + (y * vector.getY()) + (z * vector.getZ());
    }

    public Vector vectorProduct(Vector vector) {
        return new Vector(
                ((y * vector.getZ()) - (z * vector.getY())),
                ((z * vector.getX()) - (x * vector.getZ())),
                ((x * vector.getY()) - (y * vector.getX()))
        );
    }

    public double cos(Vector vector) {
        return scalarProduct(vector) / (Math.abs(length() * vector.length()));
    }

    public Vector add(Vector vector) {
        return new Vector(
                x + vector.getX(),
                y + vector.getY(),
                z + vector.getZ()
        );
    }

    public Vector subtract(Vector vector) {
        return new Vector(
                x - vector.getX(),
                y - vector.getY(),
                z - vector.getZ()
        );
    }

    public static Vector[] generateArrayOfVectors(int n) {
        Vector[] generatedArrayOfVectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            generatedArrayOfVectors[i] = new Vector(
                    Math.random(),
                    Math.random(),
                    Math.random()
            );
        }
        return generatedArrayOfVectors;
    }
}
