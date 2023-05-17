/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idiomaeresolucaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;

/**
 *
 * @author Emerson
 */
public class IdiomaEResolucaoDoSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        Toolkit tol = Toolkit.getDefaultToolkit();
        Dimension dim = tol.getScreenSize();
        System.out.println("O idioma do sistema é: " + loc.getDisplayLanguage());
        System.out.println("A resolução da sua tela é: " + dim.width + " X " + dim.height);
    }
}
