package com.aluracursos.screematch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons")Integer totalDeTemporadas,
                         @JsonAlias("imdRating")String evaluacion) {
}
