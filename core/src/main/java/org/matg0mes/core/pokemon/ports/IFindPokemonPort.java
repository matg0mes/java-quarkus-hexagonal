package org.matg0mes.core.pokemon.ports;

import org.matg0mes.core.pokemon.models.Pokemon;
import org.matg0mes.core.trainer.models.Trainer;

public interface IFindPokemonPort {

    Pokemon findPokemonById(Long id);

}
