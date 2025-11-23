package com.example.Photo_Gallary.controller;

import com.example.Photo_Gallary.model.Image;
import com.example.Photo_Gallary.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Controller
public class PhotoController {

    @Autowired
    private PhotoRepository photoRepository;
//Index page test

//    @GetMapping(value = "/index")
//    public String showIndexPage() {
//        return "index";
//    }

    @GetMapping("/")
    public String showIndexPage(Model model) {
        List<Image> images = photoRepository.findAll();
        model.addAttribute("images", images);
        if (images.isEmpty()) {
            model.addAttribute("message", "No images added yet!");
        } else {
            model.addAttribute("images", images);
        }

        return "index"; // loads templates/index.html
    }


    //adding images ....
    @PostMapping(value = "/add-image")
    public String addImage(
//            @ModelAttribute Image image,
            @RequestParam("file") MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return "redirect:/?error=empty";
        }

        byte[] imageContent = file.getBytes();
        String imageBase64 = Base64.getEncoder().encodeToString(imageContent);
        String imageString = "data:image/png;base64," + imageBase64;

        Image image = new Image();
        image.setUrl(imageString);

        photoRepository.save(image);

        return "redirect:/";
    }

    //trying delete functions
    @PostMapping("/delete-image")
    public String deleteImage(@RequestParam("id") long id) {
        photoRepository.deleteById(id);
        return "redirect:/";
    }


    @GetMapping(value = "/list-image")
    public String showImages(Model model) {
        List<Image> images = photoRepository.findAll();

        if (images.isEmpty()) {
            model.addAttribute("message", "No images added yet!");
        }
        else {
            model.addAttribute("images", images);
        }

        return "index";
    }

}


