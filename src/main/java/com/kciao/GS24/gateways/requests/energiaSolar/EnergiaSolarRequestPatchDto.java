package com.kciao.GS24.gateways.requests.energiaSolar;

import com.kciao.GS24.domains.Endereco;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class EnergiaSolarRequestPatchDto {
    @NotEmpty
    private int areaPlaca;
    @NotEmpty
    private Double irradiacaoSolar;
}
