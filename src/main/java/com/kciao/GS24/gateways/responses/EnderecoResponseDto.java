package com.kciao.GS24.gateways.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kciao.GS24.domains.Usuario;
import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class EnderecoResponseDto extends RepresentationModel<EnderecoResponseDto> {
    private Integer id;
    private String tipoResidencial;
    private String nome;
    private String cep;
    private Double tarifa;
    private Double gastoMensal;
    private Double economia;
    private Integer fk_usuario;
}
