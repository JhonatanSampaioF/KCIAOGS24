package com.kciao.GS24.gateways.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UsuarioRequestoDto {
    @NotEmpty @Min(3)
    private String nome;
    @NotEmpty @Email
    private String email;
}
