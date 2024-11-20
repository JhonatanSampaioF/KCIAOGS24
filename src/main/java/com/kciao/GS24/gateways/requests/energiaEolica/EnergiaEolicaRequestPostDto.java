package com.kciao.GS24.gateways.requests.energiaEolica;

import com.kciao.GS24.domains.Endereco;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

@Data
public class EnergiaEolicaRequestPostDto {
    @NotEmpty @NumberFormat(pattern = "##.##")
    private Double potenciaNominal;
    @NotEmpty
    private Double alturaTorre;
    @NotEmpty
    private Double diametroRotor;
    @NotEmpty
    private Double energiaEstimadaGerada;
    @NotEmpty
    private Endereco fk_endereco;
}
