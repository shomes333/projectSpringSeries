package com.aluracursos.screematch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public record DatoSerie(@JsonAlias("Title") String titulo,
                        @JsonAlias("totalSeasons")Integer totalDeTemporadas,
                        @JsonAlias("imdRating")String evaluacion) {
}
