package org.matg0mes.core.pokemon.usecases;

import org.matg0mes.core.pokemon.models.Pokemon;
import org.matg0mes.core.trainer.models.Trainer;

public interface IFindPokemonUseCase {

    Pokemon execute(Long id);
}
