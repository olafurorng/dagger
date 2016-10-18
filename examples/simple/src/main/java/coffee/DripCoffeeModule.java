package coffee;

import dagger1.Module;
import dagger1.Provides;
import javax.inject.Singleton;

@Module(
    injects = CoffeeApp.class,
    includes = PumpModule.class
)
class DripCoffeeModule {
  @Provides @Singleton Heater provideHeater() {
    return new ElectricHeater();
  }
}
