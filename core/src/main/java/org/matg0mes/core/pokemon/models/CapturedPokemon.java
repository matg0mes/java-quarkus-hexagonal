package org.matg0mes.core.pokemon.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter @Setter
public class CapturedPokemon {

    private Long id;

    private String pokeBall;

    private Pokemon pokemon;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
