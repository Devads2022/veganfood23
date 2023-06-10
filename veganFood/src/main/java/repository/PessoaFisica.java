package repository;

import model.PessoaFisicaApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisica extends JpaRepository<PessoaFisicaApplication, Long> {
}
