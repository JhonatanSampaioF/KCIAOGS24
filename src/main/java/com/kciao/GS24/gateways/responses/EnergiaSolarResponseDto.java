package com.kciao.GS24.gateways.responses;

import com.kciao.GS24.domains.Endereco;
import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
public class EnergiaSolarResponseDto extends RepresentationModel<EnergiaSolarResponseDto> {
    private int areaPlaca;
    private Double energiaNecessaria;
    private Double irradiacaoSolar;
    private Endereco fk_endereco;
}
