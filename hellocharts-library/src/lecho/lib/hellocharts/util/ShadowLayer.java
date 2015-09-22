package lecho.lib.hellocharts.util;

/**
 * A simple class representing values used to set shadow layer.
 */
public class ShadowLayer {
    private float radius;
    private float dx;
    private float dy;
    private int shadowColor;

    public ShadowLayer() {}

    public ShadowLayer(float radius, float dx, float dy, int shadowColor) {
        this.radius = radius;
        this.dx = dx;
        this.dy = dy;
        this.shadowColor = shadowColor;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getDx() {
        return dx;
    }

    public void setDx(float dx) {
        this.dx = dx;
    }

    public float getDy() {
        return dy;
    }

    public void setDy(float dy) {
        this.dy = dy;
    }

    public int getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(int shadowColor) {
        this.shadowColor = shadowColor;
    }
}
