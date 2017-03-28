package linxdcn.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void test() {
		// Log a simple message
	    log.debug("debug level log");
	    log.info("info level log");
	    log.error("error level log");
	}
}
