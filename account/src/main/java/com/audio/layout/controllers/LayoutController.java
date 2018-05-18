package com.audio.layout.controllers;

import com.audio.account.models.entity.User;
import com.audio.layout.models.entity.Layout;
import com.audio.layout.services.LayoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/layout")
public class LayoutController {
    @Autowired
    private LayoutService layoutService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Layout read(@RequestBody Layout layout) throws Exception {
        if (layout == null) return null;
        return layoutService.read(layout);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Layout update(@RequestBody Layout layout) throws Exception {
        if (layout == null) return null;
        return layoutService.update(layout);
    }

}
