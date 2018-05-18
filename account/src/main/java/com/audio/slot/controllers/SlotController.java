package com.audio.slot.controllers;

import com.audio.slot.models.entity.Slot;
import com.audio.slot.services.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/slot")
public class SlotController {
    @Autowired
    private SlotService slotService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Slot> read() throws Exception {
        List<Slot> s = slotService.read();
        return s;

    }

}
