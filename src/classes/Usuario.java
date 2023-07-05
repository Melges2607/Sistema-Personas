
package classes;

public class Usuario {
    private String idUsuario;
    private String nome;
    private String senha;
    private String tipoPerfil; 

    public Usuario(String idUsuario, String nome, String senha, String tipoPerfil) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.senha = senha;
        this.tipoPerfil = tipoPerfil;
        
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getSenha() {
        return senha;
    }
}
