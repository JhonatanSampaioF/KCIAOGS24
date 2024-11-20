package com.kciao.GS24.gateways.requests.endereco;

import com.kciao.GS24.domains.Usuario;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

@Data

public class EnderecoRequestPatchDto {
    @NotEmpty
    private String tipoResidencial;
    @NotEmpty
    private String nome;
    @NotEmpty
    private String cep;
    @NotEmpty @NumberFormat(pattern = "##.#####")
    private Double tarifa;
    @NotEmpty
    private Double gastoMensal;
}
