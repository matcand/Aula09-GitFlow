package org.example;

public class LoginService {

    public boolean validarSenha(String senha) {
        if (senha == null || senha.isBlank()) {
            return false;
        }
        return senha.length() >= 8;
    }

    public static void main(String[] args) {
        LoginService service = new LoginService();
        System.out.println("Senha válida: " + service.validarSenha("Macal1234"));
    }
}