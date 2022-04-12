package loca.carros.LocaCarros.dto;

import loca.carros.LocaCarros.models.Rendimento;

import java.util.ArrayList;
import java.util.List;

public class RendimentosListContainer {
    List<Rendimento> rendimentos;

    public List<Rendimento> getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(List<Rendimento> rendimentos) {
        this.rendimentos = rendimentos;
    }

    public RendimentosListContainer(){
        rendimentos = new ArrayList<>();
    }
}
