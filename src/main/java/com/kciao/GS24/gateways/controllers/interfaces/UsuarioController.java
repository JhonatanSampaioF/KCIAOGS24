package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.UsuarioRequestDto;
import com.kciao.GS24.gateways.responses.UsuarioResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public interface UsuarioController {
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Optional<UsuarioResponseDto>> buscarUsuario(@PathVariable @Valid Integer id);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<List<UsuarioResponseDto>> buscarTodosUsuario();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<UsuarioResponseDto> criarUsuario(@RequestBody @Valid UsuarioRequestDto usuario);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Optional<UsuarioResponseDto>> atualizarUsuario(@PathVariable @Valid Integer id, @RequestBody @Valid UsuarioRequestDto usuario);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void deletarUsuario(@PathVariable @Valid Integer id);
}
