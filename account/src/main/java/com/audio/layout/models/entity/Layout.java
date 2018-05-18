package com.audio.layout.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "layouts")
public class Layout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="user_id")
    protected Long userId;

    @Column(name="layout_str")
    private String layoutStr;

    public Layout(){

    }
    public Layout(Long userId, String layoutStr){
        this.userId = userId;
        this.layoutStr = layoutStr;
    }
}
