package com.kciao.GS24.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "tipo_residencial")
    private String tipoResidencial;
    private String nome;
    private String cep;
    private Double tarifa;
    @Column(name = "gasto_mensal")
    private Double gastoMensal;
    @ManyToOne
    private Usuario fk_usuario;
}
