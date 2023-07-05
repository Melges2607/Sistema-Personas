
package classes;

import formularios.frmLogin;

public class JavaSistemaDeVendas {

   
    public static void main(String[] args) {
        Dados validaUsuario = new Dados();
       
        frmLogin miLogin = new frmLogin();
        miLogin.setDados(validaUsuario);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
    
}
