package com.it.pradhan;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class EmailConfig {
	private String code;
	private Integer port;
	
	
}
