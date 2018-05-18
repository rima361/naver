package com.audio.slot.services;

import com.audio.slot.models.entity.Slot;
import com.audio.slot.repositories.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SlotService {
    @Autowired
    private SlotRepository slotRepository;

    public List<Slot> read() throws Exception {
        List<Slot> slotList  = StreamSupport.stream(slotRepository.findAll().spliterator(), false).collect(Collectors.toList());
        return slotList;
    }

}
