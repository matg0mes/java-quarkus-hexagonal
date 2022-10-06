package org.matg0mes.core.trainer.models;

import lombok.Getter;
import lombok.Setter;
import org.matg0mes.core.pokemon.models.CapturedPokemon;

import java.time.LocalDateTime;
import java.util.List;
@Getter @Setter
public class Trainer {

    private String name;

    private List<CapturedPokemon> capturedPokemons;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
