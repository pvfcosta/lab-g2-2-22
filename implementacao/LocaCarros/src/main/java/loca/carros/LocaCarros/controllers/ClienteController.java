package loca.carros.LocaCarros.controllers;

import loca.carros.LocaCarros.models.Cliente;
import loca.carros.LocaCarros.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("")
    public ModelAndView index(){
        List<Cliente> clientes = this.clienteRepository.findAll();
        ModelAndView mv = new ModelAndView("clientes/index");
        mv.addObject("clientes",clientes);
        return mv;
    }
}
