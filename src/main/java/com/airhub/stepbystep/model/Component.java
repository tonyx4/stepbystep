package com.airhub.stepbystep.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Entidad: Component (Componente Aeronáutico)
 * Espejo exacto de la tabla 'components' en phpMyAdmin.
 */
@Entity
@Table(name = "components") // Conecta exactamente con el nombre de la tabla
@Data
@NoArgsConstructor
public class Component {

    // 1. id (bigint(20) AUTO_INCREMENT)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // 2. part_number (varchar(255))
    @Column(name = "part_number")
    private String partNumber;

    // 3. serial_number (varchar(255))
    @Column(name = "serial_number")
    private String serialNumber;

    // 4. description (varchar(255))
    @Column(name = "description", nullable = false) // Es 'No' Null en tu imagen
    private String description;

    // 5. manufacturer (varchar(255))
    @Column(name = "manufacturer")
    private String manufacturer;

    // 6. ata_chapter (int(2))
    @Column(name = "ata_chapter")
    private Integer ataChapter;

    // 7. release_document_type (varchar(255))
    @Column(name = "release_document_type")
    private String releaseDocumentType; // Mapeado como String

    // 8. release_document_number (varchar(255))
    @Column(name = "release_document_number")
    private String releaseDocumentNumber;

    // 9. last_overhaul_date (date)
    @Column(name = "last_overhaul_date")
    private LocalDate lastOverhaulDate;

    // 10. shelf_life_expiry (date)
    @Column(name = "shelf_life_expiry")
    private LocalDate shelfLifeExpiry;

    // 11. tsn (double)
    @Column(name = "tsn")
    private Double tsn; // Time Since New

    // 12. csn (int(10))
    @Column(name = "csn")
    private Integer csn; // Cycles Since New

    // 13. tso (double)
    @Column(name = "tso")
    private Double tso; // Time Since Overhaul

    // 14. cso (int(10))
    @Column(name = "cso")
    private Integer cso; // Cycles Since Overhaul

    // 15. condition (enum(...))
    @Column(name = "condition", nullable = false) // Mapeado como String
    private String condition = "SV"; // Valor por defecto de tu DB

    // 16. warehouse_location (varchar(255))
    @Column(name = "warehouse_location")
    private String warehouseLocation;

    // 17. installed_on_aircraft_id (bigint(20))
    @Column(name = "installed_on_aircraft_id")
    private Long installedOnAircraftId; // Usamos el ID numérico, NO la relación completa

    // 18. created_at (timestamp)
    @Column(name = "created_at", insertable = false, updatable = false) // Dejamos que MySQL lo maneje
    private LocalDateTime createdAt;

    // 19. updated_at (timestamp)
    @Column(name = "updated_at", insertable = false, updatable = false) // Dejamos que MySQL lo maneje
    private LocalDateTime updatedAt;

    // 20. location (varchar(255))
    @Column(name = "location")
    private String location;

    // 21. status (varchar(255))
    @Column(name = "status")
    private String status;
}