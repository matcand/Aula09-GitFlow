package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoServiceTest {

    private final NotificacaoService service = new NotificacaoService();

    @Test
    void deveEnviarEmailQuandoFormatoForValido() {
        assertTrue(service.enviarEmail("macal@fatec.sp.gov.br"));
    }

    @Test
    void deveFalharQuandoEmailForInvalidoOuNulo() {
        assertThrows(IllegalArgumentException.class, () -> service.enviarEmail("email-sem-arroba.com"));
        assertThrows(IllegalArgumentException.class, () -> service.enviarEmail(null));
    }

    @Test
    void deveExecutarMainComSucesso() {
        NotificacaoService.main(new String[]{});
    }
}