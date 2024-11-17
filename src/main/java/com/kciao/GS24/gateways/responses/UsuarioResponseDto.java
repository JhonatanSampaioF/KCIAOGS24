package com.kciao.GS24.gateways.responses;

import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
public class UsuarioResponseDto extends RepresentationModel<UsuarioResponseDto> {
    private String nome;
    private String email;
}
