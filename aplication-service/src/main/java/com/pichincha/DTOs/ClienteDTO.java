package com.pichincha.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)

public class ClienteDTO {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("contrasena")
    private String contrasena;

    @JsonProperty("estado")
    private boolean estado;

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("genero")
    private String genero;

    @JsonProperty("edad")
    private int edad;

    @JsonProperty("identificacion")
    private String identificacion;

    @JsonProperty("direccion")
    private String direccion;

    @JsonProperty("telefono")
    private String telefono;
}


