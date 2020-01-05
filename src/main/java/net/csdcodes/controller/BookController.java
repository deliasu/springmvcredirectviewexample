package net.csdcodes.controller;

import net.csdcodes.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class BookController {
    @GetMapping("/")
    private String addBookForm(){
        return "add_book";
    }
    @PostMapping("/add-book")
    private String addBook(@ModelAttribute("book") Book book, RedirectAttributes redirectAttributes ){
        redirectAttributes.addAttribute("isbn", book.getIsbn());
        redirectAttributes.addAttribute("title", book.getTitle());
        redirectAttributes.addAttribute("author", book.getAuthor());
        redirectAttributes.addAttribute("quantity", book.getQuantity());
        return "redirect:/success";
    }

    @GetMapping("/success")
    private String success(@RequestParam("isbn") String isbn, @RequestParam("title") String title, @RequestParam("author") String author, @RequestParam("quantity") String quantity, Model model){
        model.addAttribute("isbn", isbn);
        model.addAttribute("title", title);
        model.addAttribute("author", author);
        model.addAttribute("quantity", quantity);
        return "success";
    }
}
