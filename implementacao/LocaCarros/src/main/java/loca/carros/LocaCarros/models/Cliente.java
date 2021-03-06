package loca.carros.LocaCarros.models;

import javax.persistence.*;

@Entity
public class Cliente extends Usuario {


    @Column(nullable = false)
    private long cpf;
    @Column(nullable = false)
    private String rg;
    @Column(nullable = false)
    private String profissao;

    public Cliente() {
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf=" + cpf +
                ", rg='" + rg + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
