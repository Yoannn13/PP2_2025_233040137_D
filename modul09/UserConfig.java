/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul09;

import java.io.Serializable;

public class UserConfig implements Serializable {
    private String username;
    private int fontsize;

    // Constructor
    public UserConfig(String username, int fontsize) {
        this.username = username;
        this.fontsize = fontsize;
    }

    // Getter dan Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getFontsize() {
        return fontsize;
    }

    public void setFontsize(int fontsize) {
        this.fontsize = fontsize;
    }

    @Override
    public String toString() {
        return "UserConfig{username='" + username + "', fontsize=" + fontsize + "}";
    }
}