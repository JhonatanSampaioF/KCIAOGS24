package com.kciao.GS24.gateways.requests.endereco;

import com.kciao.GS24.domains.Usuario;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

@Data

public class EnderecoRequestPatchDto {

    @NotEmpty(message = "Tipo residencial não pode ser vazio")
    @Schema(description = "Tipo do local", example = "Residencial")
    private String tipoResidencial;

    @NotEmpty(message = "Apelido não pode ser vazio")
    @Schema(description = "Apelido do local", example = "Casa")
    private String nome;

    @NotEmpty(message = "CEP não pode ser vazio")
    @Schema(description = "CEP do local", example = "01234567")
    private String cep;

    @NotNull(message = "Tarifa não pode ser vazio")
    @Schema(description = "Tarifa em reais", example = "0.12345")
    private Double tarifa;

    @NotNull(message = "Gasto mensal não pode ser vazio")
    @Schema(description = "Gasto mensal em reais", example = "345.0")
    private Double gastoMensal;

    @NotNull(message = "Economia não pode ser vazio")
    @Schema(description = "Economia mensal em reais", example = "300.0")
    private Double economia;
}
