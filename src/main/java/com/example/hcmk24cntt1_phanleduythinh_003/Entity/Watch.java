package com.example.hcmk24cntt1_phanleduythinh_003.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name ="Watch")
@AllArgsConstructor
public class Watch {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "model_name")
    private String model_name;
    private String brand;
    private double price;
    private String movement_type;
    private boolean status;
    private String is_delete;
}
