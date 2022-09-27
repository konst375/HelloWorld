package habrTasks.vector;

import java.util.Random;

record Vector(int x, int y, int z) {

    public double length() {
        return Math.sqrt(Math.pow(this.x(), 2) + Math.pow(this.y(), 2) + Math.pow(this.z(), 2));
    }

    public double scalarProduct(Vector vector) {
        return this.x() * vector.x() + this.y() * vector.y() + this.z() * vector.z();
    }

    public Vector vectorProduct(Vector vector) {
        return new Vector(
                this.y() * vector.z() - this.z() * vector.y(),
                this.z() * vector.x() - this.x() * vector.z(),
                this.x() * vector.y() - this.y() * vector.x()
        );
    }

    public double cos(Vector vector) {
        return this.scalarProduct(vector) / this.length() * vector.length();
    }

    public Vector sum(Vector vector) {
        return new Vector(
                this.x() + vector.x(),
                this.y() + vector.y(),
                this.z() + vector.z()
        );
    }

    public Vector difference(Vector vector) {
        return new Vector(
                this.x() - vector.x(),
                this.y() - vector.y(),
                this.z() - vector.z()
        );
    }

    public static Vector[] randomVectors(int n) {
        Vector[] result = new Vector[n];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = new Vector(
                    random.nextInt(100),
                    random.nextInt(100),
                    random.nextInt(100)
            );
        }
        return result;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + ", " + z + "]";
    }
}
