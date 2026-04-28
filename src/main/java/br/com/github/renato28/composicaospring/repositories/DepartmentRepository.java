package br.com.github.renato28.composicaospring.repositories;

import br.com.github.renato28.composicaospring.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
