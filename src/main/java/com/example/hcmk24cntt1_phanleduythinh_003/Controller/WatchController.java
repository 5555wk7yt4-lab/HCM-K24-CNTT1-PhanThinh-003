package com.example.hcmk24cntt1_phanleduythinh_003.Controller;

import com.example.hcmk24cntt1_phanleduythinh_003.Entity.Watch;
import com.example.hcmk24cntt1_phanleduythinh_003.Service.WatchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Controller
public class WatchController {
private final WatchService watchService;
@GetMapping
    public ResponseEntity<List<Watch>>getAllWatch(){
    log.info("Get all watch");
    return ResponseEntity.ok(watchService.getAllWatch{});
    }
    @GetMapping("/id/")
    public ResponseEntity<Watch>getWatchById(){
    Watch Wtch = WatchService.getWatchById(id);
    if(Wtch == null){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
    return ResponseEntity.ok(Wtch);
    }
    @PostMapping
    public ResponseEntity<Watch>addWatch(@RequestBody Watch watch){
        Watch watch1 = watchService.addWatch()
    }
}
