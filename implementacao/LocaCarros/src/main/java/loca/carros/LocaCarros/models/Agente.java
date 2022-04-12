package loca.carros.LocaCarros.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Agente extends Usuario{

    @Column(nullable = false)
    public String cnpj;
}
