package com.kciao.GS24.gateways.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kciao.GS24.domains.Endereco;
import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class EnergiaSolarResponseDto extends RepresentationModel<EnergiaSolarResponseDto> {
    private Integer id;
    private int areaPlaca;
    private Double irradiacaoSolar;
    private Double energiaEstimadaGerada;
    private Integer fk_endereco;
}
