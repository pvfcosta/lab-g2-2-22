package loca.carros.LocaCarros.repositories;

import loca.carros.LocaCarros.models.Rendimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RendimentoRepository extends JpaRepository<Rendimento, Long> {

    @Query("select r from Rendimento r where r.idCliente = ?1")
    List<Rendimento> findRendimentosByIdCliente(long idCliente);
}
