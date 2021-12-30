package kr.co.aconic;

import io.jooby.GracefulShutdown;
import io.jooby.Jooby;
import io.jooby.di.GuiceModule;
import io.jooby.hikari.HikariModule;
import io.jooby.jdbi.JdbiModule;

public class App extends Jooby {

	{
		install(new HikariModule());
		install(new JdbiModule());
		install(new GuiceModule());
		install(new GracefulShutdown());
		mvc(Controller.class);
	}

	public static void main(final String[] args) {
		runApp(args, App::new);
	}

}
