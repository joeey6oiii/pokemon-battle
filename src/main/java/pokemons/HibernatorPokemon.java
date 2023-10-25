package pokemons;

import ru.ifmo.se.pokemon.Type;
import attacks.physicalAttack.*;

public class HibernatorPokemon extends LittleBearPokemon {
    public HibernatorPokemon(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL);
        this.addMove(new HammerArm());
        this.setStats(90, 130, 75, 75, 75, 55);
    }
}