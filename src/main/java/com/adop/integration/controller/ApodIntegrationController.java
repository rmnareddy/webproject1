package com.adop.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adop.integration.domain.ApodResponse;
import com.adop.integration.service.ApodIntegrationService;

@RestController
@RequestMapping(value = "/nasa")
public class ApodIntegrationController {
	
	@Autowired
	private ApodIntegrationService apodIntegrationService;
	
	   @GetMapping("/apod")
	    public ApodResponse getPictureOfTheDay (@RequestParam(name = "date", required = false) String date,
	                                     @RequestParam(name="start_date", required = false) String start_date,
	                                     @RequestParam(name="end_date", required = false) String end_date,
	                                     @RequestParam(name="count", required = false) Integer count,
	                                     @RequestParam(name="thumbs", required = false) Boolean thumbs ) {
	        return apodIntegrationService.getPictureOfTheDay(date, start_date, end_date, count, thumbs);
	    }

}
