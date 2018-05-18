package com.audio.layout.repositories;

import com.audio.layout.models.entity.Layout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LayoutRepository extends CrudRepository<Layout, Long> {
    Layout findByUserId(@Param("userId") Long userId);


}
