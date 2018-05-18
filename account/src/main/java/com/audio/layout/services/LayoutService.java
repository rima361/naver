package com.audio.layout.services;

import com.audio.layout.models.entity.Layout;
import com.audio.layout.repositories.LayoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class LayoutService {
    @Autowired
    private LayoutRepository layoutRepository;

    public Layout read(Layout layout) throws Exception {
        Layout l = layoutRepository.findByUserId(layout.getUserId());
        if (l != null) return l;
        else return null;
        // 여기서 null을 리턴하면, 클라이언트 단에서 exception 발생 -> global exception 처리
    }

    @Transactional
    public Layout update(Layout layout) throws Exception {
        Layout l = layoutRepository.findByUserId(layout.getUserId());
        l.setLayoutStr(layout.getLayoutStr());
        return l;
    }

}
