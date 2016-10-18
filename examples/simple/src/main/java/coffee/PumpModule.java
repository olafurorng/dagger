package coffee;

import dagger1.Module;
import dagger1.Provides;

@Module(complete = false, library = true)
class PumpModule {
  @Provides Pump providePump(Thermosiphon pump) {
    return pump;
  }
}
