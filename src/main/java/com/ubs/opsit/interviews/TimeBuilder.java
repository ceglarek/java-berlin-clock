package com.ubs.opsit.interviews;

/**
 * @author Pawel Ceglik
 */
public class TimeBuilder
{
   private int hour;

   private int minutes;

   private int seconds;

   public TimeBuilder withHour(int hour) {
      this.hour = hour;
      return this;
   }

   public TimeBuilder withMinutes(int minutes) {
      this.minutes = minutes;
      return this;
   }

   public TimeBuilder withSeconds(int seconds) {
      this.seconds = seconds;
      return this;
   }

   public Time build() {
      return new Time(hour, minutes, seconds);
   }
}
