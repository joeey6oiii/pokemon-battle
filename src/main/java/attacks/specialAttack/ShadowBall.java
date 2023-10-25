package attacks.specialAttack;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect LowerSpecDef = new Effect().stat(Stat.SPECIAL_DEFENSE, -1)
                .chance(0.2).turns(-1);
        p.addEffect(LowerSpecDef);
    }

    @Override
    protected String describe(){
        return "uses Shadow Ball";
    }
}
