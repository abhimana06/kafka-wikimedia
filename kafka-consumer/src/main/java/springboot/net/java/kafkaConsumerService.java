package springboot.net.java;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import springboot.net.java.entity.Wikimedia;
import springboot.net.java.repository.WikimediaDataRepo;

@Service
@Slf4j
public class kafkaConsumerService {

    @Autowired
    private WikimediaDataRepo wikimediaDataRepo;

    @KafkaListener(topics = "wikimedia_recentchange", groupId = "myGroup")
    public void consume(String eventMessage){
        Wikimedia wikimedia = new Wikimedia();
        wikimedia.setWikiMessage(eventMessage);
        log.info("Storing Data to Database : " + eventMessage);
        wikimediaDataRepo.save(wikimedia);
    }

}
