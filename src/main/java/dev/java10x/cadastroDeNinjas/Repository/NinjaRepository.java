package dev.java10x.cadastroDeNinjas.Repository;

import dev.java10x.cadastroDeNinjas.Entity.NinjaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaEntity, Long> {
}
