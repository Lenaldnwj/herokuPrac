package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Desciptionnnnn"),
                new Topic(),
                new Topic("java", "core", "core Desciptionnnnn"),
                new Topic("javascript", "javascript Framework", "javascript Desciptionnnnn")
                );
    }

//    @RequestMapping("/lul")
//    public String lel() {
//        return "lull";
//    }
}