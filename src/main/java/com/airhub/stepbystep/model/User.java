package com.airhub.stepbystep.model;

import jakarta.persistence.*;
import java.util.Date; // Necesario para el manejo de fechas de licencia
import org.springframework.format.annotation.DateTimeFormat;

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
    @Column(name = "id")
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

    /**
     * Nombre de usuario para el sistema.
     */
    @Column(name = "username")
    private String username;

    /**
     * Hash de la contraseña del usuario.
     */
    @Column(name = "password")
    private String password;

    /**
     * Número de licencia técnica (ej. LMA, A&P).
     */
    @Column(name = "license_number")
    private String licenseNumber;

    /**
     * Fecha de vencimiento de la licencia.
     */
    @Column(name = "license_expiry")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd") // <--- AÑADE ESTA LÍNEA
    private Date licenseExpiry;

    /**
     * Sello RII (Required Inspection Item).
     */
    @Column(name = "inspector_seal")
    private String inspectorSeal;

    /**
     * Especialidades técnicas certificadas.
     */
    @Column(name = "specialty")
    private String specialty;

    /**
     * Estado actual del usuario en el sistema.
     */
    @Column(name = "status")
    private String status = "Active";

    /**
     * Hash adicional para seguridad (Spring Security).
     */
    @Column(name = "password_hash")
    private String passwordHash;

    // Constructor vacío (Requerido por JPA)
    public User() {
    }

    /**
     * Constructor con parámetros (Sincronizado con la base de datos completa).
     */
    public User(Long id, String fullName, String email, String role, String username, String password,
                String licenseNumber, Date licenseExpiry, String inspectorSeal, String specialty, String passwordHash) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.username = username;
        this.password = password;
        this.licenseNumber = licenseNumber;
        this.licenseExpiry = licenseExpiry;
        this.inspectorSeal = inspectorSeal;
        this.specialty = specialty;
        this.passwordHash = passwordHash;
    }

    // --- Getters y Setters ---

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

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getLicenseExpiry() {
        return licenseExpiry;
    }

    public void setLicenseExpiry(Date licenseExpiry) {
        this.licenseExpiry = licenseExpiry;
    }

    public String getInspectorSeal() {
        return inspectorSeal;
    }

    public void setInspectorSeal(String inspectorSeal) {
        this.inspectorSeal = inspectorSeal;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}