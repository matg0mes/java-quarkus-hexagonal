package org.matg0mes.core.pokemon.usecases.impl;

import org.matg0mes.core.pokemon.models.Pokemon;
import org.matg0mes.core.pokemon.ports.IFindPokemonPort;
import org.matg0mes.core.pokemon.usecases.IFindPokemonUseCase;
import org.matg0mes.core.trainer.ports.IFindTrainerPort;

public class FindPokemonUseCase implements IFindPokemonUseCase {
    IFindPokemonPort iFindPokemonPort;

    public FindPokemonUseCase(IFindPokemonPort iFindPokemonPort) {
        this.iFindPokemonPort = iFindPokemonPort;
    }

    @Override
    public Pokemon execute(Long id) {
        return iFindPokemonPort.findPokemonById(id);
    }
}
