package com.airhub.stepbystep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

/**
 * Entidad que representa un usuario del sistema.
 */

@Entity
@Table(name = "users")
public class Usuario{

    /**
     * Identificador único del usuario.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    /**
     * Nombre completo del usuario.
     */

    @Column(name = "full_name")
    private String nombre;

    /**
     * Correo electrónico del usuario.
     */

    @Column(name = "email")
    private String correo;

    /**
     * Cargo o rol del usuario dentro de la empresa.
     */

    @Column(name = "position")
    private String cargo;

    @Column(name = "username")
    private String username;

    @Column(name = "password_hash")
    private String password;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String correo, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.cargo = cargo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}