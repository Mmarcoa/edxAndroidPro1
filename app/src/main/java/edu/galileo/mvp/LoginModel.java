package edu.galileo.mvp;

/**
 * Model layer. Business logic
 */

public interface LoginModel {

    /**
     * Realiza el inicio de sesión
     * @param username nombre de usuario, debe ser un correo electrónico válido
     * @param password contraseña de inicio de sesión
     */
    void login(String username, String password);
}
