/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;

/**
 *
 * @author GENESIS
 */
public class User {
    private String usernm,nama, alamat;
    
    protected void setUsername(String usernm){
        this.usernm = usernm;
    }
    
    protected String getUsername(User user){
        return usernm;
    }
    protected void setNama (String nama){
        this.nama = nama;
    }
    
    protected String getNama(User user){
        return nama;
    }
    protected void setAlamat (String alamat){
        this.nama = alamat;
    }
    
    protected String getAlamat(User user){
        return alamat;
    }
}
