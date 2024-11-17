package com.kciao.GS24.gateways.responses;

import com.kciao.GS24.domains.Endereco;
import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
public class EnergiaEolicaResponseDto extends RepresentationModel<EnergiaEolicaResponseDto> {
    private Double potenciaNominal;
    private Double alturaTorre;
    private Double diametroRotor;
}
