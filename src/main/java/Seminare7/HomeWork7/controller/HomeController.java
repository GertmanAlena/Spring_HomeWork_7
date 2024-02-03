package Seminare7.HomeWork7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * Домашняя страница.
     * @return представление домашней страницы.
     */
    @GetMapping("/")
    public String home(){
        return "home";
    }

    /**
     * Страница для пользователей с ролью USER.
     * @return публичное представление.
     */
    @GetMapping("/public-data")
    public String userPage(){
        return "public-data";
    }

    /**
     * Страница для пользователей с ролью ADMIN.
     * @return закрытое представление.
     */
    @GetMapping("/private-data")
    public String adminPage(){
        return "private-data";
    }

    /**
     * Страница отказа в доступе.
     * @return представление отказа в доступе.
     */
    @GetMapping("/error")
    public String accessDenied(){
        return "error";
    }

    /**
     * Аутентификация пользователя.
     * @return представление аутентификации.
     */
    @GetMapping("/login")
    public String auth(){
        return "login";
    }

}
