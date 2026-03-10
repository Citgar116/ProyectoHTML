package com.upiiz.proyecto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EtiquetasController {

    @GetMapping({"/", "/inicio"})
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/html")
    public String html() {
        return "html";
    }

    @GetMapping("/head")
    public String head() {
        return "head";
    }

    @GetMapping("/body")
    public String body() {
        return "body";
    }

    @GetMapping("/h1")
    public String h1() {
        return "h1";
    }

    @GetMapping("/h2")
    public String h2() {
        return "h2";
    }

    @GetMapping("/p")
    public String p() {
        return "p";
    }

    @GetMapping("/span")
    public String span() {
        return "span";
    }

    @GetMapping("/strong")
    public String strong() {
        return "strong";
    }

    @GetMapping("/em")
    public String em() {
        return "em";
    }

    @GetMapping("/a")
    public String a() {
        return "a";
    }

    @GetMapping("/img")
    public String img(){return "img";}

    @GetMapping("/video")
    public String video(){return "video";}

    @GetMapping("/audio")
    public String audio(){return "audio";}

    @GetMapping("/li")
    public String li(){return "li";}

    @GetMapping("/table")
    public String table(){return "table";}

    @GetMapping("/tr")
    public String tr(){return "tr";}

    @GetMapping("/td")
    public String td(){return "td";}

    @GetMapping("/form")
    public String form(){return "form";}

    @GetMapping("/input")
    public String input(){return "input";}

    @GetMapping("/button")
    public String button(){return "button";}


}
