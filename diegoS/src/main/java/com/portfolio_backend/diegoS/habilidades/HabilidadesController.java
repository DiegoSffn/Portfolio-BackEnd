
package com.portfolio_backend.diegoS.habilidades;

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
public class HabilidadesController {
    
    public final HabilidadesService habServ;
    
    @PostMapping("habilidad")
    public void nuevaHabilidad(@RequestBody Habilidades hab){
        habServ.nuevaHabilidad(hab);
    }
    
    @DeleteMapping("habilidad/{id}")
    public void borrarHabilidad(@PathVariable Long id){
        habServ.eliminarHabilidad(id);
    }
    
    @GetMapping("habilidad")
    public List<Habilidades> listaHabilidades(){
        return habServ.listaHabilidades();
    }
    
    @GetMapping("habilidad/{id}")
    @ResponseBody
    public Habilidades buscarPorId(@PathVariable Long id){
        return habServ.buscarHabilidadPorId(id);
    }
    
    @PutMapping("habilidad/{id}")
  @ResponseBody
  
    public Habilidades editarHabilidad(@PathVariable Long id,@RequestBody Habilidades habRequest){
        
        return habServ.editarHabilidad(id, habRequest);
       
    }
    
}
