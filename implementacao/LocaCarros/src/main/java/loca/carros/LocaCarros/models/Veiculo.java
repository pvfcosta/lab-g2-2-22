package loca.carros.LocaCarros.models;

import javax.persistence.*;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String placa;
    @Column(nullable = false)
    private String matricula;
    @Column(nullable = false)
    private int ano;
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    private String modelo;
    @Column(nullable = false)
    private long idProprietario;

    public Veiculo(){
    }

    public long getId() { return id; }

    public void setId(long id) {
        this.id = id;
    }

    public void setIdProprietario(long idProprietario) { this.idProprietario = idProprietario; }

    public long getIdProprietario() { return idProprietario; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getModelo() { return modelo; }

    public void setMarca(String marca) { this.marca = marca; }

    public String getMarca() { return marca; }

    public int getAno() { return ano; }

    public void setAno(int ano) { this.ano = ano; }

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getPlaca() { return placa; }

    public void setPlaca(String placa) { this.placa = placa; }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", ano='" + ano + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", proprietario='" + idProprietario + '\'' +
                '}';
    }
}
