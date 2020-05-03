package com.wiley.posa3.evictor;

import java.util.*;

/**
 * An Evictor evicts resource based on one or more strategies. The
 * Evictor is implemented as an object that runs in its own thread of
 * control. This allows it to periodically check if there are any
 * network elements that have not been accessed for a threshold time.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class Evictor implements Runnable {

  /**
   * Default constuctor
   */
  public Evictor () {
    new Thread(this).start();
  }

  /**
   * Start execution in own thread of control
   */
  public void run() {
    // For simplicity, we run forever 
    while(true) {
      // Sleep for configured amount of time
      try {	
      	Thread.sleep(pollTime);
      } 	
      catch(InterruptedException e) { break; }
      
      // Assume "threshold" contains the date/time such that
      // any network element accessed before it will be
      // evicted
      
      // Go through all the NEs and see which ones to evict
      for(int i = 0; i < nes.length; i++) {
      	NetworkElement ne = (NetworkElement)nes[i];
      	if (ne.isEvictable()) {
      	  Date d = (Date) ne.info();
      	  if (d.before(threshold)) {
      	  	ne.beforeEviction ();
      	  	// Now remove the network element application-
      	  	// specifically
      	  }
      	}
      }
    }
  }

  private NetworkElement [] nes;
  private int pollTime = 10; // 10 s
  private Date threshold = Calendar.getInstance().getTime(); // @@ should be a future date
}
