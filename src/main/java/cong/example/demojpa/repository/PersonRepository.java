package cong.example.demojpa.repository;

import cong.example.demojpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findAllByNameContaining(String value);

    List<Person> findAllByAgeGreaterThan(int age);

}
