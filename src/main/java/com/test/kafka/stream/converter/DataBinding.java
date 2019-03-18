package com.test.kafka.stream.converter;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

public interface DataBinding {


  @Input("input1")
  KStream<String, GenericRecord> input1In();

  @Input("input1")
  KStream<String, GenericRecord> input2In();


}
