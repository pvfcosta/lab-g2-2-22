package loca.carros.LocaCarros.repositories;

import loca.carros.LocaCarros.models.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    @Query("select v from Veiculo v where v.idProprietario = ?1")
    List<Veiculo> findVeiculoByIdCliente(long idCliente);

}
