package com.kciao.GS24.gateways.requests;

import com.kciao.GS24.domains.Endereco;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EnergiaSolarRequestDto {
    @NotNull(message = "Área da placa não pode ser vazia")
    @Schema(description = "Área da placa solar em m²", example = "4")
    private int areaPlaca;

    @NotNull(message = "Irradiação solar não pode ser vazia")
    @Schema(description = "Irradiação solar local em kWh/m²", example = "5")
    private Double irradiacaoSolar;

    @NotNull(message = "Geração de energia estimada não pode ser vazia")
    @Schema(description = "Geração de energia estimada em kW", example = "500")
    private Double energiaEstimadaGerada;

    @NotNull(message = "Endereço não pode ser nulo")
    @Schema(description = "Id do endereço", example = "1")
    private Integer fk_endereco;
}
