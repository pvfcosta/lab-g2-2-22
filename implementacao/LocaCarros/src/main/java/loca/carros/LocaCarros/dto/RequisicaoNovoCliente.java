package loca.carros.LocaCarros.dto;

import loca.carros.LocaCarros.models.Cliente;
import loca.carros.LocaCarros.models.Rendimento;

import java.util.ArrayList;
import java.util.List;

public class RequisicaoNovoCliente {

    private String email;
    private String senha;
    private String nome;
    private String end;
    private long cpf;
    private String rg;
    private String profissao;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
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

    public Cliente toCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setSenha(senha);
        cliente.setCpf(cpf);
        cliente.setRg(rg);
        cliente.setProfissao(profissao);
        cliente.setEnd(end);
        return cliente;
    }

    public Cliente toCliente(Cliente cliente){
        cliente.setNome(this.nome);
        cliente.setEmail(this.email);
        cliente.setSenha(this.senha);
        cliente.setCpf(this.cpf);
        cliente.setRg(this.rg);
        cliente.setProfissao(this.profissao);
        cliente.setEnd(this.end);
        return cliente;
    }


    public void fromCliente(Cliente cliente){
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.end = cliente.getEnd();
        this.rg = cliente.getRg();
        this.profissao = cliente.getProfissao();
        this.senha = cliente.getSenha();
    }

    @Override
    public String toString() {
        return "RequisicaoNovoCliente{" +
                "email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", end='" + end + '\'' +
                ", cpf=" + cpf +
                ", rg='" + rg + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
