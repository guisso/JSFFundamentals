/*
 * CC BY-NC-SA 4.0
 *
 * Copyright 2022 Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;.
 *
 * Attribution-NonCommercial-ShareAlike 4.0 International (CC BY-NC-SA 4.0)
 *
 * You are free to:
 *   Share - copy and redistribute the material in any medium or format
 *   Adapt - remix, transform, and build upon the material
 *
 * Under the following terms:
 *   Attribution - You must give appropriate credit, provide 
 *   a link to the license, and indicate if changes were made.
 *   You may do so in any reasonable manner, but not in any 
 *   way that suggests the licensor endorses you or your use.
 *   NonCommercial - You may not use the material for commercial purposes.
 *   ShareAlike - If you remix, transform, or build upon the 
 *   material, you must distribute your contributions under 
 *   the same license as the original.
 *   No additional restrictions - You may not apply legal 
 *   terms or technological measures that legally restrict 
 *   others from doing anything the license permits.
 *
 * Notices:
 *   You do not have to comply with the license for elements 
 *   of the material in the public domain or where your use 
 *   is permitted by an applicable exception or limitation.
 *   No warranties are given. The license may not give you 
 *   all of the permissions necessary for your intended use. 
 *   For example, other rights such as publicity, privacy, 
 *   or moral rights may limit how you use the material.
 */
package io.github.guisso.mysecondjsf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 * Managed bean Eco
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 * @version 0.1, 2022-10-21 
 */

// Managed bean with name: "eco"
//@Named  OR  @Named("eco") OR ...
@Named(value = "eco")
@RequestScoped
public class Eco {

    private String texto;

    public Eco() {
        this.texto = "Indefinido";
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String obterTextoComExclamacao() {
        return this.texto + "!";
    }

}
