package br.pcb.econdata;

import br.pcb.econdata.App.MyApp;
import br.pcb.econdata.persistence.dao.TestDao;
import br.pcb.econdata.types.algebraic.Result;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class App {

  public static void main(String... args) {
    switch (new TestDao().test()) {
       case Result.Ok<String> v -> System.out.println(v.result());
       default -> System.out.println("default");
    }
    Quarkus.run(MyApp.class, args);
  }

  public static class MyApp implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
      Quarkus.waitForExit();
      return 0;
    }
  }
}
