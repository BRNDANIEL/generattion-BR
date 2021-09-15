package Security;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.blog.pessoal.atividade.Model.Usuario;
import com.blog.pessoal.atividade.Repository.UsuarioRepository;



public class UserDetailsServiceImplements implements UserDetailsService {

	@Autowired private UsuarioRepository repository;
	@Override
	
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> objOptional = repository.findByEmail(username);

        if(objOptional.isPresent()){
            return new UserDetailsImplements(objOptional.get());
        }else {
            throw new UsernameNotFoundException(username + "Não existe");
        } 
	}


	
}
