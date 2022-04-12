package loca.carros.LocaCarros.repositories;

import loca.carros.LocaCarros.models.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AluguelRepository extends JpaRepository<Aluguel, Long> {

    @Query("select a from Aluguel a where a.idCliente = ?1")
    List<Aluguel> findAluguelByIdCliente(long idCliente);
}
