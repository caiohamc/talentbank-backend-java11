package br.com.caioalbuquerque.talentbank;

import br.com.caioalbuquerque.talentbank.domain.entities.Candidate;
import br.com.caioalbuquerque.talentbank.domain.enums.GenderEnum;
import br.com.caioalbuquerque.talentbank.domain.enums.LanguageEnum;
import br.com.caioalbuquerque.talentbank.domain.enums.OccupationAreaEnum;
import br.com.caioalbuquerque.talentbank.repo.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Date;

@SpringBootApplication
public class TalentBankApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TalentBankApplication.class, args);
	}

	@Autowired
	private CandidateRepo candidateRepo;

	@Override
	public void run(String... args) throws Exception {
		this.candidateRepo.save(new Candidate(
				"Fulano","fulano@gmail.com","+5561987654321",
				GenderEnum.MALE,OccupationAreaEnum.FULLSTACK,LanguageEnum.JAVA,
				7,19200.0,43800.0,
				Date.from(Instant.now()), Date.from(Instant.now())));

		this.candidateRepo.save(new Candidate(
				"Ciclana","ciclano@gmail.com","+556912345678",
				GenderEnum.FEMALE,OccupationAreaEnum.BACKEND,LanguageEnum.PYTHON,
				4,18300.0,32500.0,
				Date.from(Instant.now()), Date.from(Instant.now())));

		this.candidateRepo.save(new Candidate(
				"Beltrano","beltrano@gmail.com","+5561981726354",
				GenderEnum.MALE,OccupationAreaEnum.FRONTEND,LanguageEnum.JAVASCRIPT,
				9,25500.0,52500.0,
				Date.from(Instant.now()), Date.from(Instant.now())));
	}
}