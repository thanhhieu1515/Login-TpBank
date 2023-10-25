/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.LoginBankDao;
import java.util.Locale;

public class LoginRepository implements ILoginRepository {

    @Override
    public void login(Locale language) {
        LoginBankDao.Instance().login(language);
    }  
}
