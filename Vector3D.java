public class Vector3D {
    private double x;
    private double y;
    private double z;

    // Constructor
    public Vector3D(double xComponent, double yComponent, double zComponent) {
        this.x = xComponent;
        this.y = yComponent;
        this.z = zComponent;
    }

    // Getter methods to access the vector components
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}

