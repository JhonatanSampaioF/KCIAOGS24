package com.kciao.GS24.gateways.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoUsuarioResponseDto extends RepresentationModel<EnderecoUsuarioResponseDto> {
    private Integer id;
    private String tipoResidencial;
    private String nome;
    private String cep;
    private Double tarifa;
    private Double gastoMensal;
    private Double economia;
    private Double potenciaNominal;
    private Double alturaTorre;
    private Double diametroRotor;
    private Double energiaEstimadaGeradaEolica;
    private int areaPlaca;
    private Double irradiacaoSolar;
    private Double energiaEstimadaGeradaSolar;
}
