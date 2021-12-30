package kr.co.aconic;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;
import kr.co.aconic.service.MainService;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;

@Slf4j
@Path("/")
public class Controller {

	@Inject
	private MainService mainService;

	@GET
	public String sayHi() {
		return "Welcome to Jooby!";
	}

	@GET("/hello")
	public String sayHo() {
		return "HoHo!";
	}

	@GET("/hi")
	public String sayHello() {
		return "Hello!";
	}

	@GET("/new")
	public String isIt() {
		String testStr = "I'm deadly serious!";

		log.debug("RespMsg: {}", testStr);

		return testStr;
	}

	@GET("/sample")
	public String valueTest() {
		return mainService.doSomething();
	}

	@GET("/lombok")
	public String lombok() {
		return mainService.doSomethingTwo().toString();
	}

	@GET("/jdbi")
	public String jdbi() {

		return "";
	}

}
