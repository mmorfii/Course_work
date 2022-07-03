package com.example.shelter;

import com.example.shelter.models.Post;
import com.example.shelter.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpController {

    @Autowired
    private PostRepository postRepository;


    @GetMapping("/help")
    public String helpMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "help";
    }





}