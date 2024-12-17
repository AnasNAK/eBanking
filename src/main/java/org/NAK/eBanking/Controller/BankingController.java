package org.NAK.eBanking.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BankingController {

    @GetMapping("/myLoans")
    public String getMyLoans(Authentication authentication) {
        return "Loans information for user: " + authentication.getName();
    }

    @GetMapping("/myCards")
    public String getMyCards(Authentication authentication) {
        return "Cards information for user: " + authentication.getName();
    }

    @GetMapping("/myAccount")
    public String getMyAccount(Authentication authentication) {
        return "Account information for user: " + authentication.getName();
    }

    @GetMapping("/myBalance")
    public String getMyBalance(Authentication authentication) {
        return "Balance information for user: " + authentication.getName();
    }
}
