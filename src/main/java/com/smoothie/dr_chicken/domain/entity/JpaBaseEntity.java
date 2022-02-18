package com.smoothie.dr_chicken.domain.entity;


import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;


/*
    순수 JPA
 */
@MappedSuperclass
@Getter
public class JpaBaseEntity {


    @Column(updatable = false)
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;


    @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        this.createdDate = now;
        this.updatedDate = now;
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedDate = LocalDateTime.now();
    }

}
