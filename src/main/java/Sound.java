import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
    /* to be implemented in part (a) */
    int count = 0;
    for(int i= 0; i < samples.length; i ++){
      if(samples[i]) > limit){
        count++;
        samples[i] = limit;
        
      }else if(samples[i] < -limit){
        count++;
        samples[i] = -limit;
      }
    }
    return count;
    
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    /* to be implemented in part (b) */
    int n = 0;
    while(samples[n] == 0){
      n++;
    }
    int [] newSamples = new int[samples.length-n];
      for(int i = 0; i < newSamples.length; i++){
      newSamples[i] = samples[i+n];
    }
    samples = newSamples;
  }
}
