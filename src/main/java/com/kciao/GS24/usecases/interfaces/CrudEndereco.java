package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPatchDto;
import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPostDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CrudEndereco {
    EnderecoResponseDto save(EnderecoRequestPostDto endereco);
    Optional<EnderecoResponseDto> findById(Integer id);
    List<EnderecoResponseDto> findAll();
    Optional<EnderecoResponseDto> update(Integer id, EnderecoRequestPatchDto endereco);
    void delete(Integer id);
}
