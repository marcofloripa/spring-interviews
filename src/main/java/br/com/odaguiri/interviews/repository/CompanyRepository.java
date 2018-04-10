package br.com.odaguiri.interviews.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.odaguiri.interviews.entity.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {

}
