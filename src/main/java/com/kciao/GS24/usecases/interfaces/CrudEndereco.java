package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPatchDto;
import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPostDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import com.kciao.GS24.gateways.responses.EnderecoUsuarioResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CrudEndereco {
    EnderecoResponseDto save(EnderecoRequestPostDto endereco);
    Optional<EnderecoResponseDto> findById(Integer id);
    Page<EnderecoResponseDto> findAll(Pageable pageable);
    Optional<EnderecoResponseDto> update(Integer id, EnderecoRequestPatchDto endereco);
    void delete(Integer id);
    Page<EnderecoUsuarioResponseDto> findAllByUser(Pageable pageable, Integer id);
}
