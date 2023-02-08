package com.uploadFiles.files.controllers;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('ROLE_USER') ")
   // @Secured({"USER","ROLE_MODERATOR","ROLE_ADMIN"})
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
   // @Secured({"ROLE_MODERATOR"})
    public String moderatorAccess() {
        return "Moderator Board.";
    }

    @GetMapping("/consultant")
    @PreAuthorize("hasRole('ROLE_CONSULTANT')")
    public String consultantAccess() {
        return "Consultant Board.";
    }
    @GetMapping("/manager")
    @PreAuthorize("hasRole('ROLE_MANAGER')")
    public String managerAccess() {
        return "Manager Board.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    // @Secured({"ROLE_ADMIN"})
    public String adminAccess() {
        return "Admin Board.";
    }

}
