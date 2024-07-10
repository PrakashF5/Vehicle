package com.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriangleController {
    @GetMapping("/starPattern")
   public String generateStarPattern(
            @RequestParam(name = "path", defaultValue = "1") int path,
            @RequestParam(name = "rows", defaultValue = "5") int rows) {
        StringBuilder pattern = new StringBuilder();

        switch (path) {
            case 1:
                // Pattern 1: Right-aligned triangle
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < rows - i - 1; j++) {
                        pattern.append(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        pattern.append("* ");
                    }
                    pattern.append("\n");
                }
                break;

            case 2:
                // Pattern 2: Pyramid
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < rows - i - 1; j++) {
                        pattern.append(" ");
                    }
                    for (int k = 0; k <= 2 * i; k++) {
                        pattern.append("*");
                    }
                    pattern.append("\n");
                    pattern.append(" ");
                    
                }
                break;

            case 3:
                // Pattern 3: Inverted Pyramid
                for (int i = rows - 1; i >= 0; i--) {
                    for (int j = 0; j < rows - i - 1; j++) {
                        pattern.append(" ");
                    }
                    for (int k = 0; k <= 2 * i; k++) {
                        pattern.append("*");
                    }
                    pattern.append("\n");
                }
                break;

            default:
                pattern.append("Invalid path.");
        }

        return pattern.toString();
    }
}

