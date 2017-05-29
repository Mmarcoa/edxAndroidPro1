package edu.galileo.mvp;

/**
 * Capa de Vista.
 */

public interface LoginView {

    /**
     * Muestra u oculta la barra de progreso.
     * @param showProgress boolean, true: muestra progreso
     */
    void  showProgress(boolean showProgress);

    /**
     * Muestra los errores en el campo name.
     * @param messageResId Resource id del error que se quiera mostrar
     */
    void setUsernameError(int messageResId);

    /**
     * Muestra los errores en el campo password
     * @param messageResId resource id del error que se quiera mostrar
     */
    void setPasswordError(int messageResId);
}
