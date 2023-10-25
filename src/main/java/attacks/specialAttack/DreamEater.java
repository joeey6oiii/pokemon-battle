package attacks.specialAttack;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    int HealthDrain;
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        if(def.getCondition().equals(Status.SLEEP)){
            def.setMod(Stat.HP, (int) Math.round(damage));
            this.HealthDrain = (int) Math.round(0.5 * damage);
        }
        else{
            def.setMod(Stat.HP, 0);
            this.HealthDrain = 0;
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, -HealthDrain);
    }

    /*
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
    att.setMod(Stat.HP, -HealthDrain);
    }
    */

    @Override
    protected String describe(){
        return "использует Dream Eater";
    }
}
