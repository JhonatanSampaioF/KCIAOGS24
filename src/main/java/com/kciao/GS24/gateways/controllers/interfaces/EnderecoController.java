package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.EnderecoRequestoDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/endereco")
public interface EnderecoController {
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Optional<EnderecoResponseDto>> buscarEndereco(@PathVariable @Valid String id);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<List<EnderecoResponseDto>> buscarTodosEndereco();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<EnderecoResponseDto> criarEndereco(@RequestBody @Valid EnderecoRequestoDto endereco);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Optional<EnderecoResponseDto>> atualizarEndereco(@PathVariable @Valid String id, @RequestBody @Valid EnderecoRequestoDto endereco);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void deletarEndereco(@PathVariable @Valid String id);
}
