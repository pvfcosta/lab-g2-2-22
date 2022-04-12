package loca.carros.LocaCarros.controllers;

import loca.carros.LocaCarros.dto.RequisicaoNovoCliente;
import loca.carros.LocaCarros.models.Cliente;
import loca.carros.LocaCarros.models.Rendimento;
import loca.carros.LocaCarros.repositories.ClienteRepository;
import loca.carros.LocaCarros.repositories.RendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private RendimentoRepository rendimentoRepository;

    private static Cliente clienteLogado;


    @GetMapping("/perfil")
    public ModelAndView perfil(){
        ModelAndView mv;
        List<Rendimento> rendimentos = new ArrayList<>();
        if (clienteLogado.getId()>0) {
            mv = new ModelAndView("clientes/perfil");
            mv.addObject("perfil", clienteLogado);
            rendimentos = this.rendimentoRepository.findRendimentosByIdCliente(clienteLogado.getId());
            mv.addObject("rendimentos", rendimentos);
        }
        else
            mv = new ModelAndView("clientes");

        return mv;
    }

    @GetMapping("/entrar")
    public ModelAndView entrar(){
        ModelAndView mv = new ModelAndView("clientes/entrar");

        return mv;
    }

    @PostMapping("/entrar")
    public String autenticar(String email, String senha){
        this.clienteLogado = this.clienteRepository.findClienteByEmailAndAndSenha(email,senha);
        return "redirect:perfil";

    }

    @GetMapping("/cadrend")
    public ModelAndView cadrend(){
        ModelAndView mv = new ModelAndView("clientes/cadrend");

        return mv;
    }

    @PostMapping("/cadrend")
    public String createrendimento(@ModelAttribute Rendimento rendimento){
        rendimento.setIdCliente(clienteLogado.getId());
        this.rendimentoRepository.save(rendimento);

        return "redirect:perfil";

    }

    @GetMapping("")
    public ModelAndView index(){
        List<Cliente> clientes = this.clienteRepository.findAll();
        ModelAndView mv = new ModelAndView("clientes/index");
        mv.addObject("clientes",clientes);
        return mv;
    }

    @GetMapping("/new")
    public ModelAndView nnew(){
        ModelAndView mv = new ModelAndView("clientes/new");

        return mv;
    }

    @PostMapping("")
    public String create(@ModelAttribute RequisicaoNovoCliente requisicao){
        Cliente cliente = requisicao.toCliente();
        this.clienteRepository.save(cliente);
        return "redirect:";

    }
    @GetMapping("/edit")
    public ModelAndView edit(RequisicaoNovoCliente reqUpdate){
        ModelAndView mv = new ModelAndView("clientes/edit");
        RequisicaoNovoCliente requisicao = new RequisicaoNovoCliente();
        requisicao.fromCliente(clienteLogado);
        mv.addObject("requisicaoNovoProfessor",requisicao);

        return mv;

    }

    @PostMapping("/edit")
    public ModelAndView update(@ModelAttribute RequisicaoNovoCliente reqUpdate){
        clienteLogado = reqUpdate.toCliente(clienteLogado);
        this.clienteRepository.save(clienteLogado);
        return new ModelAndView("clientes/entrar");
    }

    @GetMapping("/deletar")
    public String deletar(){
        this.clienteRepository.deleteById(clienteLogado.getId());
        return "redirect:entrar";
    }
}
