package com.emergentes.dao;

import com.emergentes.modelo.Rol;
import java.util.List;

public interface RolDAO {
    
    public void insert(Rol rol) throws Exception;
    public void update(Rol rol) throws Exception;
    public void delete(int id_r) throws Exception;
    public Rol getById(int id_r) throws Exception;
    public List<Rol> getAll() throws Exception;
    
}
