package ${package};

import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.*;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	// *************************************************************************
	//
	// Launcher
	//
	// *************************************************************************

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder().sources(Application.class).run(args);
	}

	// *************************************************************************
	//
	// Methods from CommandLineRunner interface
	//
	// *************************************************************************

	@Override
	public void run(String... strings) throws Exception {
		LOGGER.info("{}", this.envInfo);
	}
}

