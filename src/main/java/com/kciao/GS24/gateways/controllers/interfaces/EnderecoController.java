package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPatchDto;
import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPostDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import com.kciao.GS24.gateways.responses.EnderecoUsuarioResponseDto;
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
@RequestMapping("/endereco")
@Tag(name = "Endereços", description = "Endpoints para gerenciamento da tabela de endereços")
public interface EnderecoController {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Busca o registro de um endereço", description = "Retorna um registro de um endereço com o id especificado.")
    ResponseEntity<Optional<EnderecoResponseDto>> buscarEndereco(@PathVariable @Valid Integer id);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Busca todos os registros de endereços", description = "Retorna uma lista paginada de todos os endereços registrados.")
    ResponseEntity<Page<EnderecoResponseDto>> buscarTodosEndereco(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sort,
            @RequestParam(defaultValue = "ASC") Sort.Direction direction
    );

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria um registro de um endereço", description = "Cria um registro de um endereço e retorna o mesmo.")
    ResponseEntity<EnderecoResponseDto> criarEndereco(@RequestBody @Valid EnderecoRequestPostDto endereco);

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Atualiza o registro de um endereço", description = "Atualiza um registro de um endereço e retorna o mesmo atualizado.")
    ResponseEntity<Optional<EnderecoResponseDto>> atualizarEndereco(
            @PathVariable @Valid Integer id,
            @RequestBody @Valid EnderecoRequestPatchDto endereco
    );

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Deleta o registro de um endereço", description = "Deleta um registro de um endereço.")
    void deletarEndereco(@PathVariable @Valid Integer id);

    @GetMapping("/usuario")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Busca todos os registros de endereços de um usuario", description = "Retorna uma lista paginada de todos os endereços registrados de um usuário.")
    ResponseEntity<Page<EnderecoUsuarioResponseDto>> buscarTodosEnderecoDeUmUsuário(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sort,
            @RequestParam(defaultValue = "ASC") Sort.Direction direction,
            @RequestParam Integer usuario
    );
}
