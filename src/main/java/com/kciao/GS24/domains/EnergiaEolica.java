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
@Table(name = "tb_energia_eolica")
public class EnergiaEolica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "potencia_nominal")
    private Double potenciaNominal;
    @Column(name = "altura_torre")
    private Double alturaTorre;
    @Column(name = "diametro_rotor")
    private Double diametroRotor;
    @OneToOne
    private Endereco fk_endereco;
}
