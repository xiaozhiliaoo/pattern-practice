package org.lili.principles.lsp.shape;

/**
 * Created by lili on 2017/7/8.
 */
public class Square extends Rectangle{
    private long side;

    public long getSide() {
        return side;
    }

    public void setSide(long side) {
        this.side = side;
    }

    @Override
    public long getWidth() {
        return this.side;
    }

    @Override
    public void setWidth(long width) {
        this.setSide(width);
    }

    @Override
    public long getHeight() {
        return this.side;
    }

    @Override
    public void setHeight(long height) {
        this.setSide(height);
    }
}
