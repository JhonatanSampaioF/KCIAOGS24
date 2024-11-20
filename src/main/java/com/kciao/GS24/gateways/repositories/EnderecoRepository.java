package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.Endereco;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    @Modifying
    @Transactional
    @Query(value = "CALL inserir_endereco(" +
            ":fk_usuario, " +
            ":tipoResidencial, " +
            ":cep, " +
            ":tarifa, " +
            ":gastoMensal, " +
            ":nome)", nativeQuery = true)
    void insertEndereco(Integer fk_usuario, String tipoResidencial, String cep, Double tarifa, Double gastoMensal, String nome);


}
