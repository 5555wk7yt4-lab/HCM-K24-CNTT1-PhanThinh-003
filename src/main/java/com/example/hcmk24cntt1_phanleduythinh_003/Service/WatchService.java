package com.example.hcmk24cntt1_phanleduythinh_003.Service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class WatchService {
    private String id;
    private String model_name;
    private String brand;
    private double price;
    private String movement_type;
    private boolean status;
    private String is_delete;

    public WatchService addWatch(WatchService watchService){
        return watchRepository.save(watchService);
    }
    public WatchService udateWatch(WatchService watchService){
        return watchRepository.save(watchService);
    }
    public void deleteWatch(Long id){
        watchRepository.deteleById(id);
    }
    public WatchService getWatch(WatchService watchService){
        return List<Watch>
    }
}
