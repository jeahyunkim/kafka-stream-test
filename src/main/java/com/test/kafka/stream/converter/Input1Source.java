//package com.test.kafka.stream.converter;
//
//import org.apache.avro.generic.GenericRecord;
//import org.apache.kafka.streams.kstream.KStream;
//import org.springframework.cloud.stream.annotation.Input;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class input1Source {
//  @StreamListener
//  public void process(@Input("input1") KStream<String, GenericRecord> log) {
//    log.foreach((k,v) -> System.out.println(k + " : " + v));
//  }
//}
