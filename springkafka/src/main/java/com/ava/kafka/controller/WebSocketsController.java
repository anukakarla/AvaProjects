package com.ava.kafka.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.ava.kafka.bean.Response;
import com.ava.kafka.bean.User;



@Controller
public class WebSocketsController {
	@MessageMapping("/sendmsg")
    @SendTo("/topic/messages")
    public Response getMessage(User user) throws Exception {
        Thread.sleep(1000); 
        return new Response(HtmlUtils.htmlEscape(user.getFirstName(),user.getLastName()));
//        return new Response(HtmlUtils.htmlEscape(user.getFirstName()), HtmlUtils.htmlEscape(user.getLastName()));

    }

	
	
	

}
