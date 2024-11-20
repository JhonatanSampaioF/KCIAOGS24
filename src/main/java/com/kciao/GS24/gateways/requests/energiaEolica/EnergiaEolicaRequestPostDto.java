package com.kciao.GS24.gateways.requests.energiaEolica;

import com.kciao.GS24.domains.Endereco;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

@Data
public class EnergiaEolicaRequestPostDto {

    @NotNull(message = "Potência nominal não pode ser vazio")
    @Schema(description = "Potência Nominal do equipamento em kW", example = "500")
    private Double potenciaNominal;

    @NotNull(message = "Altura da torre não pode ser vazio")
    @Schema(description = "Altura da torre em metros", example = "15")
    private Double alturaTorre;

    @NotNull(message = "Diâmetro do rotor não pode ser vazio")
    @Schema(description = "Diametro do rotor em metros", example = "15")
    private Double diametroRotor;

    @NotNull(message = "Geração de energia estimada não pode ser vazio")
    @Schema(description = "Geração de energia estimada em kW", example = "500")
    private Double energiaEstimadaGerada;

    @NotNull(message = "Endereço não pode ser nulo")
    @Schema(description = "Id do endereço", example = "1")
    private Integer fk_endereco;
}
