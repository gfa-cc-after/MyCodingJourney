package Memories.services;

import Memories.CreateMemoryDTO;
import Memories.models.Memory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MemoryService {
    Page<Memory> findAll(Pageable pageable);

    Memory add(CreateMemoryDTO createMemoryDTO);

    void increaseVoteOf(Long id);

    void decreaseVoteOf(Long id);
}
