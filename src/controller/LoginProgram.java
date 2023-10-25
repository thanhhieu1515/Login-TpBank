/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Locale;
import repository.ILoginRepository;
import repository.LoginRepository;
import view.Menu;

public class LoginProgram extends Menu<String> {
    static String[] options = {"Vietnamese", "English", "Exit"};
    private ILoginRepository loginRepository;
    Locale vietnamese = new Locale("vi");
    Locale english = new Locale("en");
    public LoginProgram() {
        super("===== LOGIN PROGRAM =====", options);
        loginRepository = new LoginRepository();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1 -> loginRepository.login(vietnamese);
            case 2 -> loginRepository.login(english);
            case 3 -> System.exit(0);
        }
    }

}
