package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.sql.SQLException;
//@RestController
@Controller
public class UploadController {
    private final Uploader uploader;

    @Autowired
    public UploadController(Uploader uploader) {
        this.uploader = uploader;
    }

    @GetMapping("/")
    public String index() throws IOException {
        return "index";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file,
                       RedirectAttributes redirectAttributes) {
        try {
            uploader.upload(file);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded " + file.getOriginalFilename() + "!");
        } catch (IOException e) {
            redirectAttributes.addFlashAttribute("message",
                    file.getOriginalFilename() + "is incorrect!");
        } catch (SQLException e) {
            redirectAttributes.addFlashAttribute("message",
                    file.getOriginalFilename() + "is incorrect!");
        } finally {
            return "redirect:/";
        }
    }
}
