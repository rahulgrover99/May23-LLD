package com.scaler.splitwise.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

@MappedSuperclass
@Data
@EntityListeners(value = AuditingEntityListener.class)
public class BaseModel {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @LastModifiedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date lastModifiedAt;
    @CreatedDate
    @Temporal(TemporalType.DATE)
    private Date createdAt;
}
