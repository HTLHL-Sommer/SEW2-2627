package at.htlhl.sew2.oop.Robots;

public class Robot {
    private String color;
    private int energy;
    private boolean canWalk;

    public Robot(String color, int energy, boolean canWalk) {
        this.color = color;
        this.energy = energy;
        this.canWalk = canWalk;
    }

    public String getColor() {
        return this.color.substring(0, 1).toUpperCase() + color.substring(1);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = Math.clamp(energy, 0, 100);
    }

    public boolean isCanWalk() {
        return this.canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }
}
