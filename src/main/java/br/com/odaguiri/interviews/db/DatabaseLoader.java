package br.com.odaguiri.interviews.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.odaguiri.interviews.entity.Company;
import br.com.odaguiri.interviews.repository.CompanyRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {
	
	private final CompanyRepository companyRepository;
	
	@Autowired
	public DatabaseLoader(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Company c1 = new Company("Company 1", "Sweden", "CET");
		Company c2 = new Company("Company 2", "Germany", "CET");
		Company c3 = new Company("Company 3", "Ireland", "CET");
		Company c4 = new Company("Company 4", "Belgium", "CET");
		Company c5 = new Company("Company 5", "Canadá", "PST");
		
		companyRepository.save(c1);
		companyRepository.save(c2);
		companyRepository.save(c3);
		companyRepository.save(c4);
		companyRepository.save(c5);
	}

}
