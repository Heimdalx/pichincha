package com.pichincha.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@AllArgsConstructor()
@Getter
public class Cliente  extends  Persona{

    private String contrasena;
    private boolean estado;
}
