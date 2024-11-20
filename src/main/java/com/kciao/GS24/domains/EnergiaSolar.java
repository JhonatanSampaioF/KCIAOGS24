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
@Table(name = "tb_energia_solar")
public class EnergiaSolar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_energ_sol")
    private Integer id;
    @Column(name = "area_placa")
    private int areaPlaca;
    @Column(name = "irradiacao_solar")
    private Double irradiacaoSolar;
    @Column(name = "energ_est_gerada")
    private Double energiaEstimadaGerada;
    @OneToOne
    private Endereco fk_endereco;
}
