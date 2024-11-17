package com.kciao.GS24.gateways.requests;

import com.kciao.GS24.domains.Endereco;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class EnergiaSolarRequestDto {
    @NotEmpty
    private int areaPlaca;
    @NotEmpty
    private Double energiaNecessaria;
    @NotEmpty
    private Double irradiacaoSolar;
    @NotEmpty
    private Endereco fk_endereco;
}
