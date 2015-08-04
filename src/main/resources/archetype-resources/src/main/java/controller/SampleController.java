package ${package}.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping(value = "/api")
@RestController
public class SampleController {

	@Value("${app.env.info}")
	private String envInfo;

	// *************************************************************************
	//
	// Rest methods
	//
	// *************************************************************************

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String getInfo() {
		return this.envInfo;
	}
}
