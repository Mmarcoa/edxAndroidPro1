package edu.galileo.mvp;

/**
 * Presenter layer.
 */

public interface LoginPresenter {

    /**
     * Valida las credenciales del usuario.
     * @param username nombre de usuario, debe ser un correo electrónico
     * @param password contraseña
     */
    void validateCredentials(String username, String password);
}
