package org.lili.principles.lsp.quadrilateral;

/**
 * Created by lili on 2017/7/8.
 */
public class Square implements Quadrilateral{
    private long side;

    public long getHeight() {
        return this.getSide();
    }

    public long getWidth() {
        return this.getSide();
    }

    public void setHeight(long height) {
        this.setSide(height);
    }

    public void setWidth(long width) {
        this.setSide(width);
    }

    public long getSide() {
        return side;
    }

    public void setSide(long side) {
        this.side = side;
    }
}