
package com.portfolio_backend.diegoS.estudios;

import java.util.List;
import lombok.RequiredArgsConstructor;
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
public class EstudiosController {
    
    private final EstudiosService eduServ;
    
    @PostMapping("estudio")
    public void nuevoEstudio(@RequestBody Estudios edu){
        eduServ.nuevoEstudio(edu);
    }
    
     @DeleteMapping("estudio/{id}")
    public void borrarEstudio(@PathVariable Long id){
        eduServ.eliminarEstudio(id);
    }
    
    @GetMapping("estudio")
    @ResponseBody
    public List<Estudios> listaEstudios(){
        return eduServ.listaEstudios();
    }
    
    @GetMapping("estudio/{id}")
    @ResponseBody
    public Estudios buscarPorId(@PathVariable Long id){
        return eduServ.buscarEstudioPorId(id);
    }

  @PutMapping("estudio/{id}")
  @ResponseBody
  
    public Estudios editarPersona(@PathVariable Long id,@RequestBody Estudios eduRequest){
        
        return eduServ.editarEstudio(id, eduRequest);
       
    }
    
}
