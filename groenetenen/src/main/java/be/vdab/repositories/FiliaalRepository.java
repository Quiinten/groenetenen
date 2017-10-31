package be.vdab.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import be.vdab.entities.Filiaal;
import be.vdab.valueobjects.PostcodeReeks;

public interface FiliaalRepository extends JpaRepository<Filiaal, Long> {
	List<Filiaal> findByAdresPostcodeBetweenOrderByNaam(int van, int tot);
}