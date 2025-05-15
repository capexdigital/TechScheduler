package com.techscheduler.api.service;

import com.techscheduler.api.domain.event.Event;
import com.techscheduler.api.domain.event.EventRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EventService {

    public Event createEvent(EventRequestDTO data) {
        String imgUrl = null;

        if(data.image() != null){
            this.uploading(data.image());
        }

        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription(null);
        return newEvent;
    }

    private String uploading(MultipartFile multipartFile) {
        return "";
    }



}
