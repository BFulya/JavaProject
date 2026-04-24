package com.n11bootcamp.aopornek.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String giveMessage(String param)
    {
        System.out.println("Method parameter " + param);
        return param;
    }

}