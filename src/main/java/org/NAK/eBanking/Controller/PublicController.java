package org.NAK.eBanking.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PublicController {

    @GetMapping("/notices")
    public String getNotices() {
        return "General notices: System maintenance scheduled for next weekend.";
    }

    @GetMapping("/contact")
    public String getContactInfo() {
        return "Contact our customer support at support@ebanking.com or call 1-800-123-4567.";
    }
}
