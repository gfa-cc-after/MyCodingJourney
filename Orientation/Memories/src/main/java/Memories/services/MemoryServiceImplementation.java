package Memories.services;

import Memories.CreateMemoryDTO;
import Memories.models.Memory;
import Memories.repositories.MemoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemoryServiceImplementation implements MemoryService {

    private final MemoryRepository memoryRepository;

    @Override
    public Page<Memory> findAll(Pageable pageable) {
        return memoryRepository.findAll(pageable);
    }

    @Override
    public Memory add(CreateMemoryDTO createMemoryDTO) {
        Memory memoryToSave = Memory
                .builder().text(createMemoryDTO.getText())
                .imageUrl(createMemoryDTO.getImageUrl())
                .happenedAt(createMemoryDTO.getHappenedAt())
                .build();
        return memoryRepository.save(memoryToSave);
    }

    @Override
    public void increaseVoteOf(Long id) {
        Memory byId = memoryRepository.findById(id).orElseThrow(() -> new Error("Memory does not exists with id"));
        byId.setVotes(byId.getVotes() + 1);
        memoryRepository.save(byId);
    }

    @Override
    public void decreaseVoteOf(Long id) {
        Memory byId = memoryRepository.findById(id).orElseThrow(() -> new Error("Memory does not exists with id"));
        byId.setVotes(byId.getVotes() - 1);
        memoryRepository.save(byId);
    }
}