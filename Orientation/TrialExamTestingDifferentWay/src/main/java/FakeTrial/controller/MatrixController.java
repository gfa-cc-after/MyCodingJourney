package FakeTrial.controller;
import FakeTrial.services.MatrixService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MatrixController {
    @Autowired
    private MatrixService matrixService;
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @PostMapping("/matrix")
    public String checkMatrix(@RequestParam("matrix") String matrix, Model model) {
        String[] rows = matrix.trim().split("\n");
        int n = rows.length;
        int[][] matrixArray = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] cols = rows[i].trim().split("\\s+");
            if (cols.length != n) {
                model.addAttribute("result", "The matrix is not square. Please try again!");
                return "index";
            }
            for (int j = 0; j < n; j++) {
                matrixArray[i][j] = Integer.parseInt(cols[j]);
            }
        }

        if (matrixService.isValidMatrix(matrixArray)) {
            matrixService.saveMatrix(matrix);
            model.addAttribute("result", "This matrix is increasing!");
        } else {
            model.addAttribute("result", "This matrix is not increasing! Please try again!");
        }

        return "index";
    }
}