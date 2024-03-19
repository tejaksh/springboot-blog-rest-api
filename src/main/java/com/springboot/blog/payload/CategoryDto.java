package com.springboot.blog.payload;

import org.springframework.scheduling.support.SimpleTriggerContext;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
	private Long id;
	private String name;
	private String description;

}
