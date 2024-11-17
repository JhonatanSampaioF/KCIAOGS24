package com.kciao.GS24.gateways.requests;

import com.kciao.GS24.domains.Endereco;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

@Data
public class EnergiaEolicaRequestoDto {
    @NotEmpty @NumberFormat(pattern = "##.##")
    private Double potenciaNominal;
    @NotEmpty
    private Double alturaTorre;
    @NotEmpty
    private Double diametroRotor;
    @NotEmpty
    private Endereco fk_endereco;
}
