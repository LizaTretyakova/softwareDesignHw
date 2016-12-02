package roguelike.entities;

import roguelike.entities.hero.Wear;
import roguelike.logic.World;

/**
 * Created by the7winds on 27.11.16.
 */
public class WearBlock extends GameObject {

    private Wear wear;

    public WearBlock(World world, Wear wear) {
        super(world);
        this.wear = wear;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Wear getWear() {
        return wear;
    }
}
