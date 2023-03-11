package com.tg.minhadespensa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "MODEL")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "ID")
    private Integer product;
    @Column
    private String name;
    @Column
    private Integer quantity;
    @Column(name = "BAR_CODE")
    private Integer barCode;
    @Column
    private List<String> urlImages;
}
