package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.physicalAttack.*;
import attacks.statusMove.*;

public class LittleBearPokemon extends Pokemon {
    public LittleBearPokemon(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL);
        this.setMove(new WorkUp(), new Lick(), new SweetScent());
        this.setStats(60, 80, 50, 50, 50, 40);
    }
}
