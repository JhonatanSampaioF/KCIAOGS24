package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.EnderecoController;
import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPatchDto;
import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPostDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import com.kciao.GS24.gateways.responses.EnderecoUsuarioResponseDto;
import com.kciao.GS24.usecases.impl.CrudEnderecoImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class EnderecoControllerImpl implements EnderecoController {

    private final CrudEnderecoImpl crudEnderecoImpl;

    @Override
    public ResponseEntity<Optional<EnderecoResponseDto>> buscarEndereco(Integer id) {

        Optional<EnderecoResponseDto> enderecoResponse = crudEnderecoImpl.findById(id);

        return ResponseEntity.of(Optional.of(enderecoResponse));
    }

    @Override
    public ResponseEntity<Page<EnderecoResponseDto>> buscarTodosEndereco(int page, int size, String sort, Sort.Direction direction) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(direction,sort));

        Page<EnderecoResponseDto> pageEnderecoResponse = crudEnderecoImpl.findAll(pageable);

        return ResponseEntity.ok(pageEnderecoResponse);
    }

    @Override
    public ResponseEntity<EnderecoResponseDto> criarEndereco(EnderecoRequestPostDto endereco) {

        EnderecoResponseDto enderecoResponse = crudEnderecoImpl.save(endereco);

        return ResponseEntity.of(Optional.of(enderecoResponse));
    }

    @Override
    public ResponseEntity<Optional<EnderecoResponseDto>> atualizarEndereco(Integer id, EnderecoRequestPatchDto endereco) {

        Optional<EnderecoResponseDto> enderecoResponse = crudEnderecoImpl.update(id, endereco);

        return ResponseEntity.of(Optional.of(enderecoResponse));
    }

    @Override
    public void deletarEndereco(Integer id) {
        crudEnderecoImpl.delete(id);
    }

    @Override
    public ResponseEntity<Page<EnderecoUsuarioResponseDto>> buscarTodosEnderecoDeUmUsuário(int page, int size, String sort, Sort.Direction direction, Integer usuario) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(direction,sort));

        Page<EnderecoUsuarioResponseDto> pageEnderecoResponse = crudEnderecoImpl.findAllByUser(pageable,usuario);

        return ResponseEntity.ok(pageEnderecoResponse);
    }
}
