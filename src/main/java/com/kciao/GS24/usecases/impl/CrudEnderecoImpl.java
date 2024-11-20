package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.domains.Endereco;
import com.kciao.GS24.gateways.controllers.interfaces.EnderecoController;
import com.kciao.GS24.gateways.repositories.EnderecoRepository;
import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPatchDto;
import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPostDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudEndereco;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
@RequiredArgsConstructor
public class CrudEnderecoImpl implements CrudEndereco {

    private final EnderecoRepository enderecoRepository;

    @Override
    public EnderecoResponseDto save(EnderecoRequestPostDto endereco) {

        Endereco enderecoASerCriado = Endereco.builder()
                .tipoResidencial(endereco.getTipoResidencial())
                .nome(endereco.getNome())
                .cep(endereco.getCep())
                .tarifa(endereco.getTarifa())
                .gastoMensal(endereco.getGastoMensal())
                .fk_usuario(endereco.getFk_usuario())
                .build();

        Endereco enderecoSalvo = enderecoRepository.save(enderecoASerCriado);

        EnderecoResponseDto enderecoResponse = EnderecoResponseDto.builder()
                .tipoResidencial(enderecoSalvo.getTipoResidencial())
                .nome(enderecoSalvo.getNome())
                .cep(enderecoSalvo.getCep())
                .tarifa(enderecoSalvo.getTarifa())
                .gastoMensal(enderecoSalvo.getGastoMensal())
                .build();

        enderecoResponse.add(
                linkTo(
                        methodOn(EnderecoController.class)
                                .buscarEndereco(enderecoSalvo.getId())
                ).withSelfRel()
        );

        return enderecoResponse;
    }

    @Override
    public Optional<EnderecoResponseDto> findById(Integer id) {

        Optional<Endereco> endereco = enderecoRepository.findById(id);

        if (endereco.isPresent()) {
            EnderecoResponseDto enderecoResponse = EnderecoResponseDto.builder()
                    .tipoResidencial(endereco.get().getTipoResidencial())
                    .nome(endereco.get().getNome())
                    .cep(endereco.get().getCep())
                    .tarifa(endereco.get().getTarifa())
                    .gastoMensal(endereco.get().getGastoMensal())
                    .build();
            return Optional.of(enderecoResponse);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Page<EnderecoResponseDto> findAll(Pageable pageable) {

        Page<Endereco> pageEndereco = enderecoRepository.findAll(pageable);

        Page<EnderecoResponseDto> listEnderecoResponse = pageEndereco
                .map(endereco -> EnderecoResponseDto.builder()
                        .tipoResidencial(endereco.getTipoResidencial())
                        .nome(endereco.getNome())
                        .cep(endereco.getCep())
                        .tarifa(endereco.getTarifa())
                        .gastoMensal(endereco.getGastoMensal())
                        .build());

        return listEnderecoResponse;
    }

    @Override
    public Optional<EnderecoResponseDto> update(Integer id, EnderecoRequestPatchDto endereco) {
        Endereco enderecoASerAtualizado = Endereco.builder()
                .tipoResidencial(endereco.getTipoResidencial())
                .nome(endereco.getNome())
                .cep(endereco.getCep())
                .tarifa(endereco.getTarifa())
                .gastoMensal(endereco.getGastoMensal())
                .build();

        int enderecoAtualizado = enderecoRepository.updateById(
                id,
                enderecoASerAtualizado.getTipoResidencial(),
                enderecoASerAtualizado.getNome(),
                enderecoASerAtualizado.getCep(),
                enderecoASerAtualizado.getTarifa(),
                enderecoASerAtualizado.getGastoMensal()
        );

        if (enderecoAtualizado != 0) {
            Optional<EnderecoResponseDto> enderecoResponse = findById(id);
            if(enderecoResponse.isPresent()) {
                return enderecoResponse;
            }
            return Optional.empty();
        } else {
            return Optional.empty();
        }

    }

    @Override
    public void delete(Integer id) {
        enderecoRepository.deleteById(id);
    }
}
