package org.example;

import java.util.regex.Pattern;

public class NotificacaoService {

    private static final Pattern EMAIL_REGEX =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public boolean enviarEmail(String email) {
        if (email == null || !EMAIL_REGEX.matcher(email).matches()) {
            throw new IllegalArgumentException("Formato de email inválido: " + email);
        }
        return true;
    }

    public static void main(String[] args) {
        NotificacaoService service = new NotificacaoService();
        System.out.println("Email enviado: " + service.enviarEmail("macal@fatec.sp.gov.br"));
    }
}