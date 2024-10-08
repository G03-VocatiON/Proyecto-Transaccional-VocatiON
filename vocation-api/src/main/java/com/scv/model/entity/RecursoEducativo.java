package com.scv.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "recursos")
public class RecursoEducativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "titulo", nullable = false, length = 50)
    private String titulo;
    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;
    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id"
            ,foreignKey = @ForeignKey(name = "FK_recursoEducativo_usuario"))
    private Usuario usuario;
}
