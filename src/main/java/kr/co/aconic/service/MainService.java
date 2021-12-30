package kr.co.aconic.service;

import kr.co.aconic.dao.UserVo;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Slf4j
@Singleton
public class MainService {

	@Inject
	public MainService(@Named("sampleKey") String sampleKey) {
		log.debug("In mainService - propertyValue: {}", sampleKey);
	}

	public String doSomething() {
		return "doSomething() in MainService";
	}

	public UserVo doSomethingTwo() {
		log.debug("doSomethingTwo()");
		return new UserVo("Be0m");
	}

}
