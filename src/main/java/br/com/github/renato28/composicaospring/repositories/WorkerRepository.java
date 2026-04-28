package br.com.github.renato28.composicaospring.repositories;

import br.com.github.renato28.composicaospring.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {

}
