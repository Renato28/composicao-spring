package br.com.github.renato28.composicaospring.repositories;

import br.com.github.renato28.composicaospring.entities.HourContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HourContractRepository extends JpaRepository<HourContract, Long> {
}
