package io.github.soalvaro00.projetoAPImkt.repository;

import io.github.soalvaro00.projetoAPImkt.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
