package com.audio.slot.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "slots")
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    protected Long id;

    @Column(name="slot_name")
    private String slotName;

    @Column(name="group_id")
    private Long groupId;

    public Slot(){

    }
    public Slot(String slotName, Long groupId){
        this.slotName = slotName;
        this.groupId = groupId;
    }

}
