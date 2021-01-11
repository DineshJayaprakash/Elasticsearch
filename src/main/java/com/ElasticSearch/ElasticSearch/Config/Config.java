package com.ElasticSearch.ElasticSearch.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * Class Config
 * 
 * @created By Dinesh J
 * @Created Date 04/12
 * @description used to create singleton bean 
 */
@Configuration
public class Config {
	
	
	/**
	 * method modelMapper
	 * 
	 * @param none
	 * @return ModelMapper bean
	 * @description used for predefined utility operation
	 */
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	
	


}
