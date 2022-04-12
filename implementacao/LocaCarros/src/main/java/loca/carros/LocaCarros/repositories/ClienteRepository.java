package loca.carros.LocaCarros.repositories;

import loca.carros.LocaCarros.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("select c from Cliente c where c.email = ?1 and  c.senha = ?2")
    Cliente findClienteByEmailAndAndSenha(String email, String senha);
}
