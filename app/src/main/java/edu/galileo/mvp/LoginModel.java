package edu.galileo.mvp;

/**
 * Model layer. Business logic
 */

public interface LoginModel {

    /**
     * Callbacks
     */
    interface OnLoginFinishedListener {

        /**
         * Login canceled
         */
        void onCanceled();

        /**
         * Error en la contraseña
         */
        void onPasswordError();

        /**
         * Inicio de sesión exitoso
         */
        void onSuccess();
    }

    /**
     * Realiza el inicio de sesión
     * @param username nombre de usuario, debe ser un correo electrónico válido
     * @param password contraseña de inicio de sesión
     * @param listener listener para los callbacks
     */
    void login(String username, String password, OnLoginFinishedListener listener);
}
