package com.kciao.GS24.gateways.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UsuarioResponseDto extends RepresentationModel<UsuarioResponseDto> {
    private String nome;
    private String email;
}
