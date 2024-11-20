package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.Endereco;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    Optional<Endereco> findById(Integer id);
    Page<Endereco> findAll(Pageable pageable);
    void deleteById(Integer id);
    @Modifying
    @Transactional
    @Query(
            "UPDATE Endereco e SET " +
                    "e.tipoResidencial = :tipoResidencial," +
                    "e.nome = :nome," +
                    "e.cep = :cep," +
                    "e.tarifa = :tarifa," +
                    "e.gastoMensal = :gastoMensal, " +
                    "e.economia = :economia " +
                    "WHERE e.id = :id"
    )
    int updateById(Integer id, String tipoResidencial, String nome, String cep, Double tarifa, Double gastoMensal, Double economia);
}
