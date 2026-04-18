package com.airhub.stepbystep.model;

import jakarta.persistence.*;

/**
 * Entidad que representa un usuario del sistema (User Entity).
 */
@Entity
@Table(name = "users")
public class User {

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
    private String fullName;

    /**
     * Correo electrónico del usuario.
     */
    @Column(name = "email")
    private String email;

    /**
     * Cargo o rol del usuario dentro de la empresa.
     */
    @Column(name = "role")
    private String role;

    @Column(name = "username")
    private String username;

    @Column(name = "password_hash")
    private String password;

    // Constructor vacío (Requerido por JPA)
    public User() {
    }

    // Constructor con parámetros (corregido)
    public User(Long id, String fullName, String email, String role, String username, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.username = username;
        this.password = password;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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