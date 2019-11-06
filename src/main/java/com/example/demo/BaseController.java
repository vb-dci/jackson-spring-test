package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public abstract class BaseController<Dto extends BaseDto> {

    @PostMapping("/saveAll")
    @ResponseBody
    public List<Dto> saveAll(@RequestBody List<Dto> dtos) { return dtos; }

    @PostMapping("/save")
    @ResponseBody
    public Dto saveAll(@RequestBody Dto dto) { return dto; }
}