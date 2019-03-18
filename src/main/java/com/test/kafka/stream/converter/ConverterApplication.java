package com.test.kafka.stream.converter;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;


@SpringBootApplication
@EnableBinding({DataBinding.class})
public class
ConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConverterApplication.class, args);
	}


  @Component
  public class input1Source {
    @StreamListener
    public void process(@Input("input1") KStream<String, GenericRecord> log) {
      log.foreach((k,v) -> System.out.println(k + " : " + v));
    }
  }

  @Component
  public class input2Source {
    @StreamListener
    public void process(@Input("input1") KStream<String, GenericRecord> log) {
      log.foreach((k,v) -> System.out.println(k + " : " + v));
    }
  }

}
