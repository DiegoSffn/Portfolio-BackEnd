
package com.portfolio_backend.diegoS.login;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LoginService {
    
    private final LoginRepo logrep;
    
    public void nuevoLogin(Login log){
        logrep.save(log);
    }
    
    public void eliminarLogin(Long id){
        logrep.deleteById(id);
    }
    
    public List<Login> listaLogin(){
        return logrep.findAll();
    }
    
    public Login buscarLoginPorId(Long id){
        return logrep.findById(id).orElse(null);
    }
    
    public Login editarLogin(Long id,Login logRequest){
        
        Login newLogin = logrep.findById(id).get();
        
        newLogin.setUsuario(logRequest.getUsuario());
        newLogin.setPassword(logRequest.getPassword());
        
        return logrep.save(newLogin);
    }
}
