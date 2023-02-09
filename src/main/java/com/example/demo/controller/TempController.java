/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HariNarayanan K
 */
@RestController
public class TempController {
    
    @GetMapping("/")
    public String getValue(){
        System.out.println("Hi Chennai");
        return "Hi da";
    }
    
    @GetMapping("/name")
    public String getName(){
         System.out.println("my name is hari--------");
         System.out.println("secondary to master--------");
         return "---";
    }
}
