package com.emergentes.dao;

import com.emergentes.modelo.Usuario;
import java.util.List;

public interface UsuarioDAO {
    
    public void insert(Usuario usuario) throws Exception;
    public void update(Usuario usuario) throws Exception;
    public void delete(int id_u) throws Exception;
    public Usuario getById(int id_u) throws Exception;
    public List<Usuario> getAll() throws Exception;
    
}
