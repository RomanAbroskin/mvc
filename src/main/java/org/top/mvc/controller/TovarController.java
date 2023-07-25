package org.top.mvc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.top.mvc.entity.Tovar;
import org.top.mvc.service.TovarService;

import java.util.Optional;

@Controller
@RequestMapping("tovar")
@RequiredArgsConstructor
public class TovarController {

    private final TovarService tovarService;

    @GetMapping("")
    public String tovarList(Model model) {
        Iterable<Tovar> tovars = tovarService.getAll();
        model.addAttribute("tovars", tovars);
        return "tovar/tovar-list";
    }

    @GetMapping("new")
    public String newTovar(Model model) {
        Tovar newTovar = new Tovar();
        model.addAttribute("newTovar", newTovar);
        return "tovar/tovar-add-form";
    }

    @PostMapping("new")
    public String newTovar(Tovar newTovar, RedirectAttributes ra) {
        Tovar tovar = tovarService.register(newTovar);
        ra.addFlashAttribute("newTovar", tovar);
        return "redirect:/tovar";
    }

    @GetMapping("delete/{id}")
    public String deleteTovar(@PathVariable Integer id) {
        tovarService.deleteById(id);
        return "redirect:/tovar";
    }
    @GetMapping("details/{id}")
    public String detailsTovar(@PathVariable Integer id, Model model) {
        Optional<Tovar> tovar = tovarService.getById(id);
        if (tovar.isPresent()) {
            model.addAttribute("tovar", tovar.get());
            return "tovar/tovar-details";
        }
        return "redirect:/tovar";
    }

    @GetMapping("update/{id}")
    public String updateTovar(@PathVariable Integer id, Model model) {
        Optional<Tovar> tovar = tovarService.getById(id);
        if (tovar.isPresent()) {
            model.addAttribute("tovar", tovar);
            return "tovar/tovar-update-form";
        }
        return "redirect:/tovar";
    }

    @PostMapping("update")
    public String updateTovar(Tovar updatedTovar, RedirectAttributes ra) {
        Tovar tovar = tovarService.register(updatedTovar);
        ra.addFlashAttribute("updatedTovar", tovar);
        return "redirect:/tovar";
    }
}
