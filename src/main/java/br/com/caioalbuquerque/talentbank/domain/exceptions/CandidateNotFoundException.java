package br.com.caioalbuquerque.talentbank.domain.exceptions;

/**
 * @author Caio Henrique Albuquerque
 * @since 17/03/22
 */
public class CandidateNotFoundException extends RuntimeException {

    public CandidateNotFoundException(Long id) {
        super("Could not find candidate with id " + id);
    }
}