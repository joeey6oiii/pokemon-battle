package attacks.statusMove;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 1);
    }
    /*
    @Override
    protected void applyOppEffects(Pokemon p){
    Effect sleep = new Effect().chance(0.3).condition(Status.SLEEP); // no sleep effect in the original task
    p.addEffect(sleep);
    }
    */
    @Override
    protected String describe(){
        return "uses Double Team";
    }
}
