/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Emerson
 */
public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        Locale loc = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A hora do Sistema é:");
        System.out.println(relogio.toString());
        System.out.println("O idioma do sistema é:");
        System.out.println(loc.getDisplayLanguage());
        System.out.println("A resolução da tela é");
        System.out.println(d.width + "X" + d.height);
        
    }
}
