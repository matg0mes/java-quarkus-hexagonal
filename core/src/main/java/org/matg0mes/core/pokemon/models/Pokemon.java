package org.matg0mes.core.pokemon.models;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
public class Pokemon {
    private Long id;

    private String name;

    private String description;

    private String personality;

    private PokemonType type;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
