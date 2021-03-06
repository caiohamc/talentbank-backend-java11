package br.com.caioalbuquerque.talentbank.repo;

import br.com.caioalbuquerque.talentbank.domain.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Caio Henrique Albuquerque
 * @since 17/03/22
 */
@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Long> {

    Optional<Candidate> findById(Integer id);
}