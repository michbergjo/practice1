package com.sca.practice1;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{userId}")
    @ResponseBody
    public String displayUser(@PathVariable int userId) {
        return "User found: " + userId;
    }

    @RequestMapping("/{userId}/invoices")
    @ResponseBody
    public String displayUserInvoices(@PathVariable int userId, @RequestParam(value="date", required = false) Date dateOrNull) {
        return "User found for user: " + userId + "\nDate found: " + dateOrNull;
    }

    @RequestMapping("/{userId}/items")
    public List<String> displayStringJson() {
        return Arrays.asList("Shoes", "laptop", "button");
    }

    @RequestMapping("/{userId}/products_as_json")
    public List<Product> displayProductsJson() {
        return Arrays.asList(new Product(1, "shoes", 42.99),
                new Product(2, "books", 12.99),
                new Product(3, "bag", 45.99));
    }
}
