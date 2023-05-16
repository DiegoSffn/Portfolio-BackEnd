
package com.portfolio_backend.diegoS.persona;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    private final PersonaService personaServ;
    
    @PostMapping("persona")
    public void crearPersona(@RequestBody Persona pers){
        personaServ.crearPersona(pers);
    }
    
    @DeleteMapping("persona/{id}")
    public void borrarPersona(@PathVariable Long id){
        personaServ.eliminarPersona(id);
    }
    
    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listaPers(){
        return personaServ.listaPersonas();
    }
    
    @GetMapping("persona/{id}")
    @ResponseBody
    public Persona buscarPorId(@PathVariable Long id){
        return personaServ.buscarPersonaPorId(id);
    }
    
    @PutMapping("persona/{id}")
    @ResponseBody
    public Persona editarPersona(@PathVariable Long id,@RequestBody Persona persRequest){
        
        return personaServ.editarPersona(id, persRequest);
    }
    
}

