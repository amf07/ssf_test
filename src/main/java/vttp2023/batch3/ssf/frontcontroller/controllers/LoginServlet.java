package vttp2023.batch3.ssf.frontcontroller.controllers;

import java.io.IOException;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

@WebServlet("/loginServlet")
public class LoginServlet{
    @Autowired
    private AuthenticateAction authenticateAction;
    @GetMapping(path="application/x-www-form-urlencoded")
    public String loginPage() {
        return "login";

        
    }
}
	// TODO: Task 2, Task 3, Task 4, Task 6
	


