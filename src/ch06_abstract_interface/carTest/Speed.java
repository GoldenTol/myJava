package ch06_abstract_interface.carTest;

import java.util.Random;

public interface Speed {
    int ALLOWED_MAX_SPEED=50;
    public abstract void speedup(int su);
    public abstract void speeddown(int su);

}
