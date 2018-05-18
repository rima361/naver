package com.audio.slot.repositories;

import com.audio.slot.models.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SlotRepository extends JpaRepository<Slot, Long> {
    List<Slot> findAll();
}