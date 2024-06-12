package FakeTrial.services;

import FakeTrial.models.Matrix;
import FakeTrial.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MatrixService {
    @Autowired
    private MatrixRepository matrixRepository;

    public boolean isValidMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && matrix[i][j] < matrix[i-1][j]) return false;
                if (j > 0 && matrix[i][j] < matrix[i][j-1]) return false;
            }
        }
        return true;
    }

    public void saveMatrix(String matrixNumbers) {
        Matrix matrix = new Matrix();
        matrix.setDate(LocalDateTime.now());
        matrix.setMatrixNumbers(matrixNumbers);
        matrixRepository.save(matrix);
    }
}