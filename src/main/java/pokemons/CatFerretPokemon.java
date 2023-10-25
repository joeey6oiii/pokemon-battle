package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.physicalAttack.*;
import attacks.specialAttack.*;
import attacks.statusMove.*;

public class CatFerretPokemon extends Pokemon {
    public CatFerretPokemon(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL);
        this.setMove(new XScissor(), new ShadowBall(), new DoubleKick(), new Swagger());
        this.setStats(73, 115, 60, 60, 60, 90);
    }
}
