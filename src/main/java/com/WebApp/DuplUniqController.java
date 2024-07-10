package com.WebApp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuplUniqController {
	
	@GetMapping("/process/{input}")
    public String processString(@PathVariable String input) {
        Set<Character> lowercaseDuplicates = new HashSet<>();
        Set<Character> uppercaseUniques = new HashSet<>();

        for (Character ch : input.toCharArray()) {
            if (Character.isLowerCase(ch) && input.indexOf(ch) != input.lastIndexOf(ch)) {
                lowercaseDuplicates.add(ch);
            } else if (Character.isUpperCase(ch)) {
                uppercaseUniques.add(ch);
            }
        }

        return "Lowercase Duplicates: " + lowercaseDuplicates + 
               ", Uppercase Uniques: " + uppercaseUniques;
    }

}
