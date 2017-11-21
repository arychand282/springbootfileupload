package com.mkyong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.io.IOException;
import java.util.stream.Collectors;

@Controller
public class IndexController {

    @Autowired
    private RestUploadController restUploadController;

    @GetMapping("/")
    public String index(Model model) throws IOException {

        model.addAttribute("files", restUploadController.getListUploadedFiles().map(
                path -> MvcUriComponentsBuilder.fromMethodName(RestUploadController.class,
                        "serveFile", path.getFileName().toString()).build().toString()).collect(Collectors.toList()));

        return "upload";
    }
}
