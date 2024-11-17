package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.EnderecoRequestDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CrudEndereco {
    EnderecoResponseDto save(EnderecoRequestDto enderecoRequestDto);
    Optional<EnderecoResponseDto> findById(int id);
    List<EnderecoResponseDto> findAll();
    Optional<EnderecoResponseDto> update(int id, EnderecoRequestDto enderecoRequestDto);
    void delete(int id);
}
