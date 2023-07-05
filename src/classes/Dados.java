
package classes;


public class Dados {
    private Usuario msUsuarios[] = new Usuario[50];
    private int contUsuario;
    
    public Dados(){
        Usuario mUsuario = new Usuario("Melges", "san1","teste","Colaborador");
        msUsuarios[contUsuario] = mUsuario;
        contUsuario++;
    } 
    public boolean validarUsuario(String usuario, String senha){ 
        boolean aux = false; 
        for(int i = 0 ; i < contUsuario; i++){
            if((msUsuarios[i].getIdUsuario().equals(usuario))&& (msUsuarios[i].getSenha().equals(senha))){
                return true;
        }
                
    }
    return false;
    }

}
