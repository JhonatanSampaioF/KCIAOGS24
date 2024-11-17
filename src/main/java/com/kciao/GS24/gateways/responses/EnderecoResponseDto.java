package com.kciao.GS24.gateways.responses;

import com.kciao.GS24.domains.Usuario;
import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
public class EnderecoResponseDto extends RepresentationModel<EnderecoResponseDto> {
    private String tipoResidencial;
    private String cep;
    private Double tarifa;
    private Double gastoMensal;
}
