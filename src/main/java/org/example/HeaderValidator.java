package org.example;

public class HeaderValidator {

    public boolean isHeaderValido(String header) {
        if (header == null || header.trim().isEmpty()) {
            return false;
        }
        return header.startsWith("Bearer ");
    }

    public static void main(String[] args) {
        HeaderValidator validator = new HeaderValidator();
        System.out.println("Header nulo: " + validator.isHeaderValido(null));
        System.out.println("Header válido: " + validator.isHeaderValido("Bearer token123"));
    }
}