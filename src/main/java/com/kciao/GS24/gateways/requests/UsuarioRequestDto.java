package com.kciao.GS24.gateways.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UsuarioRequestDto {
    @NotEmpty(message = "Nome não pode ser vazio") @Size(min = 3, message = "O nome deve ter no mínimo 3 caracteres")
    @Schema(description = "Nome do usuário", example = "Maria")
    private String nome;

    @NotEmpty(message = "Email não pode ser vazio") @Email(message = "Insira um email válido")
    @Schema(description = "Email do usuário", example = "maria@email.com")
    private String email;
}
