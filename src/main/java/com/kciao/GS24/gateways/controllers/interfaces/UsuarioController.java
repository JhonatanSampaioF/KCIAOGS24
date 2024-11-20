package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.UsuarioRequestDto;
import com.kciao.GS24.gateways.responses.UsuarioResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuario")
@Tag(name = "Usuários", description = "Endpoints para gerenciamento da tabela de usuários")
public interface UsuarioController {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Busca o registro de um usuário", description = "Retorna um registro de um usuário com o id especificado.")
    ResponseEntity<Optional<UsuarioResponseDto>> buscarUsuario(@PathVariable @Valid Integer id);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Busca todos os registros de usuários", description = "Retorna uma lista paginada de todos os usuários registrados.")
    ResponseEntity<Page<UsuarioResponseDto>> buscarTodosUsuario(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sort,
            @RequestParam(defaultValue = "ASC") Sort.Direction direction
    );

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria um registro de um usuário", description = "Cria um registro de um usuário e retorna o mesmo.")
    ResponseEntity<UsuarioResponseDto> criarUsuario(@RequestBody @Valid UsuarioRequestDto usuario);

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Atualiza o registro de um usuário", description = "Atualiza um registro de um usuário e retorna o mesmo atualizado.")
    ResponseEntity<Optional<UsuarioResponseDto>> atualizarUsuario(
            @PathVariable @Valid Integer id,
            @RequestBody @Valid UsuarioRequestDto usuario
    );

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Deleta o registro de um usuário", description = "Deleta um registro de um usuário.")
    void deletarUsuario(@PathVariable @Valid Integer id);
}
