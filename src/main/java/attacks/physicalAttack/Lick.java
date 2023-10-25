package attacks.physicalAttack;

import ru.ifmo.se.pokemon.*;

public class Lick extends PhysicalMove {
    public Lick(){
        super(Type.GHOST, 30, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect paralyze = new Effect().condition(Status.PARALYZE).chance(0.3).turns(-1);
        p.setCondition(paralyze);
    }

    @Override
    protected String describe(){
        return "uses Lick";
    }
}
