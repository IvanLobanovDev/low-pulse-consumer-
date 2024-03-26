package telran.java51.pulse.service;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import telran.java51.pulse.dto.PulseDTO;

@Configuration
public class PulseService {
	
	@Bean
	Consumer<PulseDTO> receiveData(){
		return data -> {
			if (data == null) {
				return;
			}
			long delay = System.currentTimeMillis() - data.getTimestamp();
			System.out.println("delay: " + delay + ", id: " + data.getId() + ", pulse: " + data.getPayload());
		};
	}

}
