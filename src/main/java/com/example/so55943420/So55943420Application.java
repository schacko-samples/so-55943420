package com.example.so55943420;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableBinding(ShippingKStreamProcessor.class)
public class So55943420Application {

	@StreamListener("input")
	public void process(KStream<String, String> input) {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		SpringApplication.run(So55943420Application.class, args);
	}


}

interface ShippingKStreamProcessor {
	@Input("input")
	KStream<?, ?> input();
}
