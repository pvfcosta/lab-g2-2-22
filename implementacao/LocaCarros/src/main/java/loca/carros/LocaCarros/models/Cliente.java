package loca.carros.LocaCarros.models;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.persistence.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Usuario {
    @Column(nullable = false)
    private long cpf;
    @Column(nullable = false)
    private String rg;
    @Column(nullable = false)
    private String profissao;
    @Column(nullable = false)
    private String rendimentos;
    @Column(nullable = false)
    private String pedidos;

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

    public List<Rendimento> getRendimentos() {
        Type listType = new TypeToken<ArrayList<Rendimento>>(){}.getType();
        List<Rendimento> rendimentosList = new Gson().fromJson(this.rendimentos, listType);
        return rendimentosList;
    }

    public void setRendimentos(List<Rendimento> rendimentos) {
        this.rendimentos = new Gson().toJson(rendimentos);
    }

    public List<Aluguel> getPedidos() {
        Type listType = new TypeToken<ArrayList<Aluguel>>(){}.getType();
        List<Aluguel> pedidosList = new Gson().fromJson(this.pedidos, listType);
        return pedidosList;
    }

    public void setPedidos(List<ArrayList> pedidos) throws Exception {
        this.pedidos = new Gson().toJson(pedidos);
    }
}
