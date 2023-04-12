package com.pichincha.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@AllArgsConstructor()
public class Cliente  extends  Persona{

    private String contrasena;
    private boolean estado;
}
