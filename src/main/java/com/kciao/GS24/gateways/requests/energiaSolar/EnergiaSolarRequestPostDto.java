package com.kciao.GS24.gateways.requests.energiaSolar;

import com.kciao.GS24.domains.Endereco;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class EnergiaSolarRequestPostDto {
    @NotEmpty
    private int areaPlaca;
    @NotEmpty
    private Double irradiacaoSolar;
    @NotEmpty
    private Double energiaEstimadaGerada;
    @NotEmpty
    private Endereco fk_endereco;
}
