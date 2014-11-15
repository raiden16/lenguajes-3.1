
package com.jc.elementos.controller;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
public class ControladorHola {
    @RequestMapping(value="/usuario", method=RequestMethod.GET,headers={"Accept=Application/json"})
    public @ResponseBody String obtenerTodos()throws IOException{
        //Vamos a usar la implementacion de json para java
        ObjectMapper mapper=new ObjectMapper();
     return mapper.writeValueAsString(GenerarUsuarios.obtenerUsuario());
    }
}
