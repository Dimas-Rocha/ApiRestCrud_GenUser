package repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    // Método para buscar por email (Spring Data JPA cria a query automaticamente)
    Usuario findByEmail(String email);
    
    // Método para buscar usuários por nome
    List<Usuario> findByNomeContainingIgnoreCase(String nome);
}