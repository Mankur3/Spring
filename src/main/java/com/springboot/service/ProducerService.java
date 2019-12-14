package com.springboot.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;

import com.google.common.io.Resources;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;


public class ProducerService {

    public void sendMessage(String x ) throws IOException {
        KafkaProducer<String, String> producer;
        try (InputStream props = Resources.getResource("producer.props").openStream()) {
            Properties properties = new Properties();
            properties.load(props);
            producer = new KafkaProducer<>(properties);
        }


                // send lots of messages
                producer.send(new ProducerRecord<String, String>(
                        "AnkurTopic",
                        String.format(Locale.US, "{\"type\":"+x+", \"t\":%.3f, \"k\":%d}", System.nanoTime() * 1e-9, 1)));

                // every so often send to a different topic

                    producer.send(new ProducerRecord<String, String>(
                            "AnkurTopic",
                            String.format(Locale.US, "{\"type\":"+x+", \"t\":%.3f, \"k\":%d}", System.nanoTime() * 1e-9, 2)));
                    producer.send(new ProducerRecord<String, String>(
                            "AnkurTopic",
                            String.format(Locale.US, "{\"type\":"+x+", \"t\":%.3f, \"k\":%d}", System.nanoTime() * 1e-9, 3)));
                    producer.flush();
                    System.out.println("Sent msg number " + 4);
                     producer.close();
        }

    }

