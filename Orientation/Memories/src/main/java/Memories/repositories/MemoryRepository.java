package Memories.repositories;

import Memories.models.Memory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoryRepository extends JpaRepository<Memory,Long> {
}
