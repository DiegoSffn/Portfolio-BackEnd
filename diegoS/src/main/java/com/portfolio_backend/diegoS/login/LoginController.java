
package com.portfolio_backend.diegoS.login;

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
public class LoginController {
    
    public final LoginService logServ;
    
    @PostMapping("login")
    public void nuevoEstudio(@RequestBody Login log){
        logServ.nuevoLogin(log);
    }
    
    @DeleteMapping("login/{id}")
    public void borrarEstudio(@PathVariable Long id){
        logServ.eliminarLogin(id);
    }
    
    @GetMapping("login")
    @ResponseBody
    public List<Login> listaLogin(){
        return logServ.listaLogin();
    }
    
    @GetMapping("login/{id}")
    @ResponseBody
    public Login buscarPorId(@PathVariable Long id){
        return logServ.buscarLoginPorId(id);
    }
    
  @PutMapping("login/{id}")
  @ResponseBody
  
    public Login editarLogin(@PathVariable Long id,@RequestBody Login logRequest){
        
        return logServ.editarLogin(id, logRequest);
       
    }    

}
