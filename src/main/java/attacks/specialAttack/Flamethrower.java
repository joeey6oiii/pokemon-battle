package attacks.specialAttack;

import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect burn = new Effect().condition(Status.BURN).chance(0.1).turns(-1);
        p.setCondition(burn);
    }

    @Override
    protected String describe(){
        return "uses Flamethrower";
    }
}
