/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javafiddle.core.ejb;

import com.javafiddle.core.jpa.User;
import javax.ejb.Local;

/**
 *
 * @author viktor
 */
@Local
public interface LoginBeanLocal {
    public User performLogin(String nickname, String password);
}
