package ua.com.owu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ua.com.owu.dto.UserProductDTO;
import ua.com.owu.editor.ProductEditor;
import ua.com.owu.entity.Product;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserService userService;
    @Autowired
    private ProductEditor productEditor;

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("user",new User());
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute User user){
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/userPage")
    public String userPage(Model model){

        List<User> users = userService.findAllWithProducts();
        List<UserProductDTO> dtos = new ArrayList<>();
        for (User user : users) {
            UserProductDTO dto = new UserProductDTO();
            dto.setIdUser(user.getId());
            dto.setName(user.getName());
            dto.setAge(user.getAge());
            dto.setIdProduct(user.getProduct().getId());
            dto.setPName(user.getProduct().getPName());
            dto.setPType(user.getProduct().getPType());
            dtos.add(dto);
        }

//        model.addAttribute("users",userService.findAllWithProducts());
        model.addAttribute("dtos",dtos);
        return "users";
    }

    @InitBinder
    public void bind(WebDataBinder binder){
        binder.registerCustomEditor(Product.class,productEditor);
    }


}
