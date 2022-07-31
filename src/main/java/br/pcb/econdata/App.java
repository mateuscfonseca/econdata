package br.pcb.econdata;

import br.pcb.econdata.persistence.dao.TestDao;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class App {

  public static void main(String... args) {
    Quarkus.run(MyApp.class, args);
  }

  public static class MyApp implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
      switch (new TestDao().test()) {
         case Result.Ok<String> v -> System.out.println(v);
         default -> System.out.println("default");
      }
      Quarkus.waitForExit();
      return 0;
    }
  }
}
