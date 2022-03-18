package br.com.caioalbuquerque.talentbank.web;

import br.com.caioalbuquerque.talentbank.domain.entities.Candidate;
import br.com.caioalbuquerque.talentbank.domain.exceptions.CandidateNotFoundException;
import br.com.caioalbuquerque.talentbank.repo.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author Caio Henrique Albuquerque
 * @since 17/03/22
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class CandidateController {
    private static final Logger LOGGER = Logger.getLogger("CandidateController");

    @Autowired
    CandidateRepo candidateRepo;

    @PutMapping("/candidates")
    Candidate saveCandidate(@RequestBody Candidate newCandidate){
        LOGGER.info("Saving new candidate in talent bank database: " + newCandidate);
        return candidateRepo.save(newCandidate);
    }

    @GetMapping("/candidates")
    List<Candidate> getCandidates(){
        LOGGER.info("Returning all candidates from talent bank database");
        return candidateRepo.findAll();
    }

    @GetMapping("/candidates/{id}")
    Candidate getCandidate(@PathVariable Long candidateId){
        LOGGER.info("Returning specific candidate from talent bank database with id " + candidateId);
        return candidateRepo.findById(candidateId).orElseThrow(() -> new CandidateNotFoundException(candidateId));
    }
}